package j2neo4j;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Yesterday
{
    @UserFunction
    @Description("j2neo4j.yesterday(formatStr)")
    public String yesterday(@Name(value = "formatStr", defaultValue = "yyyyMMdd") String formatStr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);

        Calendar c= Calendar.getInstance();
        c.add(Calendar.DATE,-1);
        return sdf.format(c.getTime());
    }
}
