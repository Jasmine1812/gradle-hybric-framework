package jquery;

public class HomePageJQueryUI {
    public static final String SEARCH_TEXTBOX_BY_NAME = "xpath=//div[@class='qgrd-header-text' and text()='%s']//parent::div//following-sibling::input";
    public static final String PAGE_LINK_BY_NUMBER = "xpath=//a[@class='qgrd-pagination-page-link' and text()='%s']";
    public static final String PAGE_LINK_ACTIVE_BY_NUMBER = "xpath=//a[@class='qgrd-pagination-page-link active' and text()='%s']";
    public static final String DYNAMIC_CELL_VALUE = "xpath=//td[@data-key='females' and text()='%s']//following-sibling::td[@data-key='country' and text()='%s']//following-sibling::td[@data-key='males' and text()='%s']//following-sibling::td[@data-key='total' and text()='%s']";
    public static final String ROW_ACTION_BY_COUNTRY_NAME = "xpath=//td[@data-key='country' and text()='%s']/preceding-sibling::td[@class='qgrd-actions']/button[contains(@class,'%s')]";
    public static final String ALL_PAGE_LINKS = "xpath=//a[contains(@class,'qgrd-pagination-page-link')]";
    public static final String ALL_VALUE_BY_COLUMN_INDEX = "xpath=//tr/td[%s]";
    public static final String COLUMN_INDEX_BY_COLUMN_NAME = "xpath=//div[text()='%s']/ancestor::th/preceding-sibling::th";
    public static final String COLUMN_INDEX_JQUERY_BY_COLUMN_NAME = "xpath=//th[text()='%s']/preceding-sibling::th";
    public static final String DYNAMIC_TEXTBOX_BY_ROW_INDEX_AND_COLUMN_INDEX = "xpath=//tr[%s]/td[%s]/input";
    public static final String DYNAMIC_DROPDOWN_BY_ROW_INDEX_AND_COLUMN_INDEX = "xpath=//tr[%s]/td[%s]//select";




}
