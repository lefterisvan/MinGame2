import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


// me to na kanoume reset to header mporoume na kanoume append sto arxeio mas kai na apofugoume to override
// autos o tropos vrethike apo stackoverflow. den vrikame allo tropo monoi mas gia na apofugoume to override sta antikeimena Users.
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