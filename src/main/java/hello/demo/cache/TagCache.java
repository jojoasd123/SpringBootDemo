package hello.demo.cache;

import hello.demo.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();

        TagDTO mobileGame = new TagDTO();
        mobileGame.setCategoryName("mobileGame");
        mobileGame.setTags(Arrays.asList("崩坏3", "明日方舟", "fgo"));
        tagDTOS.add(mobileGame);

        TagDTO onlineGame = new TagDTO();
        onlineGame.setCategoryName("OnlineGame");
        onlineGame.setTags(Arrays.asList("英雄联盟", "守望先锋", "DOTA2"));
        tagDTOS.add(onlineGame);

        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();


        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) ||
                !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }

}
