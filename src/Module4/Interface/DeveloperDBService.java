package Module4.Interface;

import Module4.Interface.DBService;
import Module4.Personal.DeveloperEmployee;

public class DeveloperDBService implements DBService {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }
}
