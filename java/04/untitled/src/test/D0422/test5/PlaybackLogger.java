package test.D0422.test5;

public class PlaybackLogger {

    void log(String title, String artist){



        class RecentLog{
            String title;
            String artist;

            public RecentLog(String title, String artist) {
                this.title = title;
                this.artist = artist;
            }

            void printLog(){
                String add = "";
                if(title.length() >=10 || artist.length() >=10){
                    add = "(인기곡)";
                }
                System.out.println("🎼 최근 재생: ["+title+"] - ["+artist+"]"+add);
            }
        }

        RecentLog r = new RecentLog(title, artist);
        r.printLog();

    }
}
