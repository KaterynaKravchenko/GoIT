package Module4.Interface;

import Module4.Personal.DeveloperEmployee;

public interface DBService {
    void save (DeveloperEmployee employee);

    DeveloperEmployee get(long id);

    void update(DeveloperEmployee employee);

    DeveloperEmployee[] getAllDevelopers();
}
