package io.smart.library.entities;

import java.util.Objects;

public class Book
{

    private String id;
    private String title;
    private String author;
    private String type;
    private float price;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(author, id, price, title, type);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && Objects.equals(id, other.id)
                && Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
                && Objects.equals(title, other.title) && Objects.equals(type, other.type);
    }

    @Override
    public String toString()
    {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", type=" + type + ", price=" + price
                + "]";
    }

}
