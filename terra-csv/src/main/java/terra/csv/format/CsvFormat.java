package terra.csv.format;

import terra.csv.Transaction;

/**
 */
public interface CsvFormat {

    public Transaction parseLine(String line);

}
