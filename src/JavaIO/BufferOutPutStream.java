package JavaIO;

import java.io.*;

public class BufferOutPutStream {



    /**Use buffer to write the data into the fileOutputStream in an efficient way.
     * Use flush() to transfer data to the fileOutputStream.
     * instance of fileOutputStream pass inside the BufferOutPut constructor.
     *
     * */


    public static void main(String[] args) throws IOException {
        FileOutputStream fileInputStream = new FileOutputStream("BufferOutPutStream.txt");
        String s = "Creating file using bufferOutput";
        byte b[] =  s.getBytes();
        creatingFileUsingBufferWriter(fileInputStream,b);


    }

    public static void creatingFileUsingBufferWriter(FileOutputStream fileInputStream, byte[]b) throws IOException {
        BufferedOutputStream bufferOutPutStream = new BufferedOutputStream(fileInputStream);
        bufferOutPutStream.write(b);
        //bufferOutPutStream.flush();
        bufferOutPutStream.close();
        fileInputStream.close();


    }

}
