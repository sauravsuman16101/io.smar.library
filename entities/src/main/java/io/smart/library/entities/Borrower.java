package io.smart.library.entities;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Borrower
{

    private String id;
    private String name;
    private String address;
    private String designation;
    private List<Book> bookList;
    private float fine;
    private Map<Book, Integer> debt;

    public Map<Book, Integer> getDebt()
    {
        return debt;
    }

    public void setDebt(Map<Book, Integer> debt)
    {
        this.debt = debt;
    }

    @Override
    public String toString()
    {
        return "Borrower [id=" + id + ", name=" + name + ", address=" + address + ", designation=" + designation
                + ", bookList=" + bookList + ", fine=" + fine + ", debt=" + debt + ", membership=" + membership + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(address, bookList, debt, designation, fine, id, membership, name);
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
        Borrower other = (Borrower) obj;
        return Objects.equals(address, other.address) && Objects.equals(bookList, other.bookList)
                && Objects.equals(debt, other.debt) && Objects.equals(designation, other.designation)
                && Float.floatToIntBits(fine) == Float.floatToIntBits(other.fine) && Objects.equals(id, other.id)
                && Objects.equals(membership, other.membership) && Objects.equals(name, other.name);
    }

    private String membership;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public List<Book> getBookList()
    {
        return bookList;
    }

    public void setBookList(List<Book> bookList)
    {
        this.bookList = bookList;
    }

    public float getFine()
    {
        return fine;
    }

    public void setFine(float fine)
    {
        this.fine = fine;
    }

    public String getMembership()
    {
        return membership;
    }

    public void setMembership(String membership)
    {
        this.membership = membership;
    }

}
