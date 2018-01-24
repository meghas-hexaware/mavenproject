import com.megha.Substraction;
import org.junit.Test;
  public class TestSubstraction {
  @Test
    public void test(){
        int a=20;
        int b=10;
        Substraction s = new Substraction();
        int c=s.sub(a,b);
        System.out.println(c);
    }
}