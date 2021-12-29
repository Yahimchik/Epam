package by.yahimovich.task03classuml.exhibition.entity;

import java.util.Date;

public class Exhibition {

    private String pictureName;
    private Author author;
    private Date dateOfExhibition;

    public Exhibition(String pictureName, Author author, Date dateOfExhibition) {
        this.pictureName = pictureName;
        this.author = author;
        this.dateOfExhibition = dateOfExhibition;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getDateOfExhibition() {
        return dateOfExhibition;
    }

    public void setDateOfExhibition(Date dateOfExhibition) {
        this.dateOfExhibition = dateOfExhibition;
    }

    public static class Author {
        private String authorName;
        private String authorSurname;
        private Date dateOfCompletion;

        public Author(String authorName, String authorSurname, Date dateOfCompletion) {
            this.authorName = authorName;
            this.authorSurname = authorSurname;
            this.dateOfCompletion = dateOfCompletion;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getAuthorSurname() {
            return authorSurname;
        }

        public void setAuthorSurname(String authorSurname) {
            this.authorSurname = authorSurname;
        }

        public Date getDateOfCompletion() {
            return dateOfCompletion;
        }

        public void setDateOfCompletion(Date dateOfCompletion) {
            this.dateOfCompletion = dateOfCompletion;
        }

        @Override
        public String toString() {
            return "\nFirst Name: " + getAuthorName()
                    + "\nSurname: " + getAuthorSurname()
                    + "\nDate of completion: " + getDateOfCompletion();
        }
    }

    @Override
    public String toString() {
        return "Picture name: " + getPictureName()
                + "\nAuthor: " + getAuthor()
                + "\nDate of exhibition: " + getDateOfExhibition();
    }

}
