import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


// me to na kanoume reset to header mporoume na kanoume append sto arxeio mas kai na apofugoume to override
public class HelpObjectOutputStream extends ObjectOutputStream
{
    public HelpObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {

        reset();


    }

}