package structurals.proxy;

public class ProxyService implements IService{

    private IService service;
    private User user;

    public ProxyService(IService service, User user){
        this.service = service;
        this.user = user;
    }

    @Override
    public void write() {
        switch (this.user.getRole()){
            case 1:
                System.out.println("Rol "+this.user.getRole()+" can't write");
                break;
            case 2:
            case 3:
                this.service.write();
                break;
        }
    }

    @Override
    public void read() {
        switch (this.user.getRole()){
            case 1:
            case 2:
            case 3:
                this.service.read();
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
                this.service.update();
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
                this.service.delete();
                break;
        }
    }
}
