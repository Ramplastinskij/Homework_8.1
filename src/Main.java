public class Main {
        public static void main(String[] args) {
            Author author1 = new Author("Leo", "Tolstoy");
            Author author2 = new Author("Fiodor", "Dostoevsky");

            Book book1 = new Book("War and Peace", author1, 1869);
            Book book2 = new Book("Crime and Punishment", author2, 1866);

            book1.setPublicationYear(1873);

            System.out.println(book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                    ", published in "+ book1.getPublicationYear());

            System.out.println(book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                    ", published in " + book2.getPublicationYear());
        }
    }