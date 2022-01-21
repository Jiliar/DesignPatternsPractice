package structurals.virtual_proxy;

public class ProxyService implements IService {

    private IService service; //Complex object
    private User user;

    public ProxyService(User user){
        this.user = user;
    }

    private IService getService(){
        if(this.service == null){
            this.service = new Service();
        }
        return this;
    }

    @Override
    public void write() {
        switch (this.user.getRole()){
            case 1:
                System.out.println("Rol "+this.user.getRole()+" can't write");
                break;
            case 2:
            case 3:
                this.getService().write();
                break;
        }
    }

    @Override
    public void read() {
        switch (this.user.getRole()){
            case 1:
            case 2:
            case 3:
                this.getService().read();
                break;
        }
    }

    @Override
    public void update() {
        switch (this.user.getRole()){
            case 1:
                System.out.println("Rol "+this.user.getRole()+" can't update");
                break;
            case 2:
            case 3:
                this.getService().update();
                break;
        }
    }

    @Override
    public void delete() {
        switch (this.user.getRole()){
            case 1:
            case 2:
                System.out.println("Rol "+this.user.getRole()+" can't delete");
                break;
            case 3:
                this.getService().delete();
                break;
        }
    }
}
