package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class IDaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("get Data V1");
        return 12;
    }
}
