package org.osiam.tests.performance;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.junit.Test;

public class RetrieveListOfUsersWithComplexQuery extends AbstractPerformanceTest {

    @Test
    public void run() throws UnsupportedEncodingException {
        String queryString = "filter=meta.created gt \"2011-10-10 00:00:00\""
                + " and (userName sw \"user\" or userName eq \"irrelevant\")"
                + " and (email sw \"email\" and email.type eq \"work\")";

        osiamConnector.searchUsers(URLEncoder.encode(queryString, "UTF-8"), accessToken);
    }
}
