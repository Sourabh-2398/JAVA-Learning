package udemyExercise;
public class APIResponseParser {

    /**
     * Parses the input text and returns a Book instance containing
     * the parsed data.
     * @param response text to be parsed
     * @return Book instance containing parsed data
     */
    public static Book parse(String response) {
        Book book = new Book();
        //Book title
        String endRule = "<";
        String startRule = "<title>";
        String title = parse(response, startRule, endRule);
        book.setTitle(title);

        //Author Name
        String authorStart = "<name>";
        String authorEnd = "</name>";
        String author = parse(response, authorStart, authorEnd);
        book.setAuthor(author);

        //Publication Year
        String yearStart = "<original_publication_year type=\"integer\">";
        String yearEnd = "</original_publication_year>";
        String yearStr = parse(response, yearStart, yearEnd);
        try {
            int year = Integer.parseInt(yearStr);
            book.setPublicationYear(year);
        } catch (NumberFormatException e) {
            book.setPublicationYear(0); // Or handle the error as needed
        }

        //Average rating
        String ratingStart = "<average_rating>";
        String ratingEnd = "</average_rating>";
        String ratingStr = parse(response, ratingStart, ratingEnd);
        try {
            double rating = Double.parseDouble(ratingStr);
            book.setAverageRating(rating);
        } catch (NumberFormatException e) {
            book.setAverageRating(0.0); // Or handle the error
        }

        //Ratings Count
        String ratingsCountStart = "<ratings_count type=\"integer\">";
        String ratingsCountEnd = "</ratings_count>";
        String ratingsCountStr = parse(response, ratingsCountStart, ratingsCountEnd);
        ratingsCountStr = ratingsCountStr.replace(",", ""); // Remove commas
        try {
            int ratingsCount = Integer.parseInt(ratingsCountStr);
            book.setRatingsCount(ratingsCount);
        } catch (NumberFormatException e) {
            book.setRatingsCount(0); // Or handle the error
        }

        //image Url
        String imageUrlStart = "<image_url>";
        String imageUrlEnd = "</image_url>";
        String imageUrl = parse(response, imageUrlStart, imageUrlEnd);
        book.setImageUrl(imageUrl);



        // Your code
        return book;
    }

    public static String parse(String response, String startRule, String endRule) {
        int startIndex = response.indexOf(startRule);
        if (startIndex == -1) {
            return null; // Start rule not found
        }
        startIndex += startRule.length();
        int endIndex = response.indexOf(endRule, startIndex);
        if (endIndex == -1) {
            return null; // End rule not found
        }
        return response.substring(startIndex, endIndex).trim();


    }

    // write overloaded parse method with the 3 parameters response, startRule, endRule

    public static void main(String[] args) {
        String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                "<average_rating>3.79</average_rating>" +
                "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" +
                "<title>Walden</title>" +
                "<author>" +
                "<id type=\"integer\">10264</id>" +
                "<name>Henry David Thoreau</name>" +
                "</author>" +
                "<image_url>" +
                "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                "</image_url>" +
                "<small_image_url>" +
                "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                "</small_image_url>" +
                "</best_book>" +
                "</work>";

        APIResponseParser.parse(response);
    }
}