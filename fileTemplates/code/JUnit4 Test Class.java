import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

#parse("File Header.java")
@RunWith(MockitoJUnitRunner.class)
public class ${NAME} {

    @InjectMocks
    private ${CLASS_NAME} ;
    
    @Test
    public void test() throws Exception {

    }    
    ${BODY}
}