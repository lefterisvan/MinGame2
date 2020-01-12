import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


// me to na kanoume reset to header mporoume na kanoume append sto arxeio mas kai na apofugoume to override
public class ObjectOutputStream2 extends ObjectOutputStream
{
    public ObjectOutputStream2(OutputStream out) throws IOException
    {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {

        reset();


    }

}