package j2neo4j;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

public class Split {

    @UserFunction
    @Description("j2neo4j.split(context,splitText)")
    public String split(@Name("context") String context, @Name(value = "delimiter", defaultValue = ",") String delimiter)
    {

        if (context == null || delimiter == null) {
            return null;
        }

        String[] ret=context.split(delimiter);



        return ret[0];
    }
}
