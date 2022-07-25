package hmlsb;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;



public class LsbModule {
    
    /**
     * method embed : untuk menyisipkan bit karakter pesan ke dalam cover image
     */
    
    public void embed(String pathIn, String pathOut, String msg) throws Exception {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //load library open cv
        
        Mat A = Imgcodecs.imread(pathIn, Imgcodecs.IMREAD_COLOR); //membaca c image
        Mat B = A.clone(); //change cover image to matriks
        A.convertTo(A, CvType.CV_64FC3);
        
        int size = (int) (A.total() * A.channels()); //menghitung jumlah pixel c image
        double[] temp = new double[size];
        
        A.get(0, 0, temp);
        
        //proses penyisipan bit pesan
        for(int i=0; i<msg.length(); i++){
            int ch = (int) temp[i];
            
            String binCh = Integer.toBinaryString(ch);
            binCh = binCh.substring(0, (binCh.length()-1)) + msg.charAt(i);
            
            int newCh = Integer.parseInt(binCh, 2);
            
            temp[i] = newCh;
        }
        
        //save bit message
        B.put(0, 0, temp);
        
        Imgcodecs.imwrite(pathOut, B);
    }
    
    /**
     * method extract : untuk membaca bit karakter yang disisipkan dalam stego image
     */
    public String extract(String path, int flag) throws Exception{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);//load
        
        Mat A = Imgcodecs.imread(path, Imgcodecs.IMREAD_COLOR);//read
        A.convertTo(A, CvType.CV_64FC3);
        
        int size = (int) (A.total() * A.channels());//menghitung jumlah pixel c image
        double[] temp = new double[size];
        
        A.get(0, 0, temp);
        
        //proses read message yg disisipkan
        String msg = "";
        for(int i=0; i<flag; i++){
            int ch = (int) temp[i];
            String binCh = Integer.toBinaryString(ch);
            int nBinCh = binCh.length() - 1;
            
            msg = msg + binCh.charAt(nBinCh);
        }
        
        return msg;
    }
}
