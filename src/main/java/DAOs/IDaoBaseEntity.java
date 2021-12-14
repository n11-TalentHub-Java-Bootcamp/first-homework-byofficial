package DAOs;

import Entities.Category;
import Entities.IEntity;

import java.util.List;

public interface IDaoBaseEntity<IEntity> extends IDao{
    public List<IEntity> findAll();
    public IEntity findById(Long id);
}
