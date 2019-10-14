package com.project.myapplication.modelclass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Film {

    @SerializedName("countries")
    @Expose
    private String countries;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("partner")
    @Expose
    private String partner;
    @SerializedName("actors")
    @Expose
    private String actors;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("content_group_ptr")
    @Expose
    private Integer contentGroupPtr;
    @SerializedName("favorites")
    @Expose
    private Integer favorites;
    @SerializedName("adult")
    @Expose
    private Integer adult;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("genres")
    @Expose
    private String genres;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("content_type_ptr")
    @Expose
    private Integer contentTypePtr;
    @SerializedName("partner_path")
    @Expose
    private String partnerPath;
    @SerializedName("added")
    @Expose
    private String added;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("locked")
    @Expose
    private Integer locked;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("director")
    @Expose
    private Object director;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * No args constructor for use in serialization
     */
    public Film() {
    }

    /**
     * @param added
     * @param genres
     * @param status
     * @param partnerPath
     * @param image
     * @param contentTypePtr
     * @param contentGroupPtr
     * @param favorites
     * @param adult
     * @param director
     * @param countries
     * @param id
     * @param duration
     * @param created
     * @param description
     * @param age
     * @param name
     * @param partner
     * @param actors
     * @param year
     * @param locked
     * @param comments
     */
    public Film(String countries, Integer duration, String partner, String actors, String image, Integer contentGroupPtr, Integer favorites, Integer adult, String description, String genres, Integer year, Integer contentTypePtr, String partnerPath, String added, Integer id, Integer locked, String name, String comments, Object director, String created, String age, Integer status) {
        super();
        this.countries = countries;
        this.duration = duration;
        this.partner = partner;
        this.actors = actors;
        this.image = image;
        this.contentGroupPtr = contentGroupPtr;
        this.favorites = favorites;
        this.adult = adult;
        this.description = description;
        this.genres = genres;
        this.year = year;
        this.contentTypePtr = contentTypePtr;
        this.partnerPath = partnerPath;
        this.added = added;
        this.id = id;
        this.locked = locked;
        this.name = name;
        this.comments = comments;
        this.director = director;
        this.created = created;
        this.age = age;
        this.status = status;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getContentGroupPtr() {
        return contentGroupPtr;
    }

    public void setContentGroupPtr(Integer contentGroupPtr) {
        this.contentGroupPtr = contentGroupPtr;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getContentTypePtr() {
        return contentTypePtr;
    }

    public void setContentTypePtr(Integer contentTypePtr) {
        this.contentTypePtr = contentTypePtr;
    }

    public String getPartnerPath() {
        return partnerPath;
    }

    public void setPartnerPath(String partnerPath) {
        this.partnerPath = partnerPath;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Object getDirector() {
        return director;
    }

    public void setDirector(Object director) {
        this.director = director;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
