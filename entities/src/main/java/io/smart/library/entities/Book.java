package io.smart.library.entities;

import java.util.List;
import java.util.Objects;

public class Book
{

    private String id;
    private String title;
    private List<String> authors;
    private String edition;
    private int volume;
    private String category;
    private float price;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<String> getAuthors()
    {
        return authors;
    }

    public void setAuthors(List<String> authors)
    {
        this.authors = authors;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
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
        return Objects.hash(authors, category, edition, id, price, title, volume);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return Objects.equals(authors, other.authors) && Objects.equals(category, other.category) && Objects.equals(edition, other.edition) && Objects.equals(id, other.id) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && Objects.equals(title, other.title)
                && volume == other.volume;
    }

    @Override
    public String toString()
    {
        return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", edition=" + edition + ", volume=" + volume + ", category=" + category + ", price=" + price + "]";
    }

    public String getEdition()
    {
        return edition;
    }

    public void setEdition(String edition)
    {
        this.edition = edition;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

}
