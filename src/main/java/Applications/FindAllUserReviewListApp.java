package Applications;

import DTOs.UserReviewDto;
import EntityServices.UserReviewEntityService;

import java.util.List;

public class FindAllUserReviewListApp {
    public static void main(String[] args) {
        //Problem 4 solved
        UserReviewEntityService service = new UserReviewEntityService();
        List<UserReviewDto> userReviewList = service.findAllReviewUser(4L);

        for (UserReviewDto userReviewDto : userReviewList){
            System.out.println(userReviewDto);
        }
    }
}
