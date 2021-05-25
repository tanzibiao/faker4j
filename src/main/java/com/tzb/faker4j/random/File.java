package com.tzb.faker4j.random;

import com.tzb.faker4j.Faker;

/**
 * <b>类说明：随机文件信息</b>
 * <p>
 * <b>详细描述：随机生成文件名、路径</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 10:47:01
 **/
public class File {

    //文件后缀
    private static final String[] suffixs = new String[]{"flac", "mp3", "wav", "bmp", "gif", "jpeg", "jpg", "png", "tiff", "css", "csv", "html", "js", "json", "txt", "mp4", "avi", "mov", "webm", "doc", "docx", "xls", "xlsx", "ppt", "pptx", "odt", "ods", "odp", "pages", "numbers", "key", "pdf"};

    //单词
    private static final String[] words = new String[]{"alias","root","logs","pictures","photos","consequatur","aut","perferendis","sit","voluptatem","accusantium","doloremque","aperiam","eaque","ipsa","quae","ab","illo","inventore","veritatis","et","quasi","architecto","beatae","vitae","dicta","sunt","explicabo","aspernatur","aut","odit","aut","fugit","sed","quia","consequuntur","magni","dolores","eos","qui","ratione","voluptatem","sequi","nesciunt","neque","dolorem","ipsum","quia","dolor","sit","amet","consectetur","adipisci","velit","sed","quia","non","numquam","eius","modi","tempora","incidunt","ut","labore","et","dolore","magnam","aliquam","quaerat","voluptatem","ut","enim","ad","minima","veniam","quis","nostrum","exercitationem","ullam","corporis","nemo","enim","ipsam","voluptatem","quia","voluptas","sit","suscipit","laboriosam","nisi","ut","aliquid","ex","ea","commodi","consequatur","quis","autem","vel","eum","iure","reprehenderit","qui","in","ea","voluptate","velit","esse","quam","nihil","molestiae","et","iusto","odio","dignissimos","ducimus","qui","blanditiis","praesentium","laudantium","totam","rem","voluptatum","deleniti","atque","corrupti","quos","dolores","et","quas","molestias","excepturi","sint","occaecati","cupiditate","non","provident","sed","ut","perspiciatis","unde","omnis","iste","natus","error","similique","sunt","in","culpa","qui","officia","deserunt","mollitia","animi","id","est","laborum","et","dolorum","fuga","et","harum","quidem","rerum","facilis","est","et","expedita","distinctio","nam","libero","tempore","cum","soluta","nobis","est","eligendi","optio","cumque","nihil","impedit","quo","porro","quisquam","est","qui","minus","id","quod","maxime","placeat","facere","possimus","omnis","voluptas","assumenda","est","omnis","dolor","repellendus","temporibus","autem","quibusdam","et","aut","consequatur","vel","illum","qui","dolorem","eum","fugiat","quo","voluptas","nulla","pariatur","at","vero","eos","et","accusamus","officiis","debitis","aut","rerum","necessitatibus","saepe","eveniet","ut","et","voluptates","repudiandae","sint","et","molestiae","non","recusandae","itaque","earum","rerum","hic","tenetur","a","sapiente","delectus","ut","aut","reiciendis","voluptatibus","maiores","doloribus","asperiores","repellat"};
    /**
     * 获取路径
     * @Author tanzibiao
     * @Date 2021-04-08 10:51:50
     * @param deep 路径深度
     * @return java.lang.String
     **/
    public String path(int deep) {
        StringBuffer str = new StringBuffer();
        str.append("/");
        for (int i = 0; i < deep; i++) {
            str.append(Faker.randomList(words)).append("/");
        }
        return str.toString();
    }

    public String pathAndSuffx(int deep) {
        StringBuffer str = new StringBuffer();
        str.append("/");
        for (int i = 0; i < deep; i++) {
            str.append(Faker.randomList(words)).append("/");
        }
        str.append(Faker.randomList(words)).append(".").append(Faker.randomList(suffixs));
        return str.toString();
    }

    public String ranWordPath(int deep) {
        StringBuffer str = new StringBuffer();
        str.append("/");
        for (int i = 0; i < deep; i++) {
            str.append(Word.randomWord()).append("/");
        }
        return str.toString();
    }

}
