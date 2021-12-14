package EntityServices;

import DAOs.UserReviewDao;
import DTOs.UserReviewDto;

import java.util.List;

public class UserReviewEntityService {
    private UserReviewDao userReviewDao;

    public UserReviewEntityService() {
        userReviewDao = new UserReviewDao();
    }

    public List<UserReviewDto> findAllReviewUser(Long id){
        return userReviewDao.findAllReviewUser(id);
    }
}
