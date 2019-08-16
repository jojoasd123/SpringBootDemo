package hello.demo.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {


        if (totalCount%size==0){
            totalPage=totalCount/size;
        }
        else{
            totalPage=totalCount/size+1;
        }
        if(page<1){
            page=1;
        }

        if(page>totalPage){
            page = totalPage;
        }
        this.page = page;
        //show the page number
        pages.add(page);
        for(int i=1;i<=3;i++){
            if(page-i>0){
                pages.add(0,page-i);
            }
            if(page+i<=totalPage){
                pages.add(page+i);
            }
        }

        //Whether to show the previous page
        if (page ==1){
            showPrevious=false;
        }else{
            showPrevious=true;
        }

        //Whether to show the next page
        if(page ==totalPage){
            showNext=false;
        }else{
            showNext=true;
        }

        //whether to show the first page
        if(pages.contains(1)){
            showFirstPage=false;
        }else{
            showFirstPage=true;
        }
        //whether to show the end page
        if(pages.contains(totalPage)){
            showEndPage=false;
        }else{
            showEndPage = true;
        }
    }
}
