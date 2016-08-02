import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController implements Serializable {
    public String moveToPage1(){
        return "page1";
    }
}