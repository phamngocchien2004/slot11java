package slot11;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class News implements INews {
    int Id;
    private ArrayList<Integer> RateList;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    double AverageRate;

    public int getId() {
        return Id;
    }

    public News(int id, ArrayList<Integer> rateList, String title, String publishDate, String author, String content, double averageRate) {
        Id = id;
        RateList=new ArrayList<>();
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public double getAverageRate() {
        return AverageRate;
    }


    @Override
    public void Dislay() {
        System.out.println("Title : "+Title);
        System.out.println("PublishDate : "+PublishDate);
        System.out.println("Author : "+Author);
        System.out.println("Content: "+Content);
    }

    public void Calculate() {
        int sum =0;
        int size=RateList.size();
        if (size==0){
            return;
        }
        {
            for(Integer item : RateList){
                sum = sum + item;
            }
            EverageRate = sum / RateList.size();
        }
        }
        public void inputRate(int star){
        if(star>=1 && star<=5) {
            RateList.add(star);
            Calculate();
            return;
        }
        }
    }
