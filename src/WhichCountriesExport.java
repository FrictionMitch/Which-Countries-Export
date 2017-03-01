import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {

    public void listExporters(CSVParser parser, String exportOfInterest) {
        // For each row in the csv record...
        for (CSVRecord record : parser) {

            // Look at the "Exports" column...
            String export = record.get("Exports");

            // Check to see if the record contains "export of interest"...
            if (export.contains(exportOfInterest)) {

                // If so, print the country of that row...
                String country = record.get("Country");
                System.out.println(country);
            }

        }
    }

    public void whoExportsCoffee() {
        // leave parameter blank to select file
//        FileResource fr = new FileResource();
        FileResource fr = new FileResource("exportdata.csv");
        CSVParser parser = fr.getCSVParser();
        listExporters(parser, "coffee");
    }
}
