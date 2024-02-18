package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("daoV2")
public class IDaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("get Data V2");
        return 12;
    }
}
