package CustomAnnotation;

public class Driver {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Category[] categories = eagle.getClass().getAnnotationsByType(Category.class);
        for (Category category : categories) {
            System.out.println(category.name() );
        }
    }
}
