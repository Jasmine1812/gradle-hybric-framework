package commons;

import java.io.File;

public class GlobalConstants {
    public static final String DEV_USER_URL = "https://demo.nopcommerce.com";
    public static final String DEV_ADMIN_URL = "https://admin-demo.nopcommerce.com";
    public static final String DEV_ADMIN_USERNAME = "admin@yourstore.com";
    public static final String DEV_ADMIN_PASSWORD = "admin";
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator +  "downloadFiles" + File.separator;
    public static final String REPORTNG_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator +  "reportNGImage" + File.separator;
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 30;
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String BROWSER_EXTENSION = RELATIVE_PROJECT_PATH + File.separator + "browserExtensions" + File.separator;
    public static final String BROWSER_LOG = RELATIVE_PROJECT_PATH + File.separator + "browserLogs" + File.separator;
}
