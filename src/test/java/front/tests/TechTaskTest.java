package front.tests;

import front.BaseFront;
import org.testng.annotations.Test;

import static constants.Constant.Variables.*;


public class TechTaskTest extends BaseFront {

    @Test(description="Check search field, all and magnify btns")
    public void checkFieldsAndBtns() {
        searchFunction.open();
        searchFunction.fieldSearchFind();
        searchFunction.dropDownBtnAllFind();
        searchFunction.btnMagnifyFind();
    }

    @Test(description="Send empty search request")
    public void sendEmptySearchRequest() {
        searchFunction.open();
        searchFunction.btnMagnifyClick();
        helpers.checkingPageAndText(searchFunction.titleEmptyRequestPage, searchFunction.articleTypeAWord,
                emptyRequestString);
    }

    @Test(description="Send negative search request and getting result not found")
    public void sendBadSearchRequest() {
        searchFunction.open();
        searchFunction.fieldSearchFill(negativeSearch);
        searchFunction.btnMagnifyClick();
        helpers.checkingPageAndText(searchFunction.sectionResultNotFound, searchFunction.articleResultNotFound,
                resultNotFoundString);
    }

    @Test(description="Fill movie search request check suggestion, click on movie and check detail title")
    public void sendCorrectSearchRequestAndCheckSuggestion() {
        searchFunction.open();
        searchFunction.fieldSearchFill(positiveCase);
        searchFunction.movieTitleClick(positiveCaseMovie);
        searchFunction.detailViewTitleFind();
    }

    @Test(description="Send movie search request, find movie in different movies and check detail title")
    public void sendCorrectSearchRequestAndCheckResult() {
        searchFunction.open();
        searchFunction.fieldSearchFill(positiveCase);
        searchFunction.btnMagnifyClick();
        searchFunction.movieTitleClick(positiveCaseMovie);
        searchFunction.detailViewTitleFind();
    }

}
