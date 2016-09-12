import com.resttest.framework.RestTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sreepadbhagwat on 9/10/16.
 */
public class TestJson {
    public static void main(String[] args) throws Exception {


        File resourcesDirectory = new File("src/test/resources");
        System.out.println("Inside TestJson : "+resourcesDirectory.getAbsolutePath());





        Map<String,String> capabilities = new HashMap<String,String>();

        capabilities.put("folderpath", resourcesDirectory.getAbsolutePath());
        capabilities.put("environment", "stg");

        RestTest test = new RestTest(capabilities);

    }
}
