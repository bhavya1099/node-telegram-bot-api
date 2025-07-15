
  package karate_tests.Country;

  import com.intuit.karate.Results;
  import com.intuit.karate.Runner;
  // import com.intuit.karate.http.HttpServer;
  // import com.intuit.karate.http.ServerConfig;
  import org.junit.jupiter.api.Test;

  import static org.junit.jupiter.api.Assertions.assertEquals;

  class CountryTest {

      @Test
      void testAll() {
          String URLBASE = System.getenv().get("URL_BASE");
          Results results = Runner.path("karate-tests/Country")
                  .systemProperty("URL_BASE", URLBASE)
                  .reportDir("testReport").parallel(1);
          assertEquals(0, results.getFailCount(), results.getErrorMessages());
      }

  }
