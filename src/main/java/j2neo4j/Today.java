package j2neo4j;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Today
{
    @UserFunction
    @Description("j2neo4j.today(formatStr)")
    public String today(@Name(value = "formatStr", defaultValue = "yyyyMMdd") String formatStr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);

        return sdf.format(new Date());
    }
}
