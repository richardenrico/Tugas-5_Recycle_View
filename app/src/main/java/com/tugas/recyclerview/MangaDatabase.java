package com.tugas.recyclerview;

import java.util.ArrayList;

public class MangaDatabase {
    private static String[] mangaSynopsis = {
            "Shouya Ishida, a boy always looking for ways to beat boredom, ends up looking for it in the wrong place. Weirded out by his new classmate, a deaf transfer student named Shouko Nishimiya, he deems her as the target of his ostracizing and bullying. Day after day, Shouya picks on Shouko, unaware of the effects of his thoughtless actions. He finally understands the pain he has inflicted on her when one day, his bullying culminates in her leaving the school, and his classmates begin to shun and harass him every chance they get instead. Determined to right his wrongs, five years later, Shouya, now a third year high school loner, meets Shouko again. Thus begins the story of a young man's path to redemption.",

            "Hundreds of years ago, horrifying creatures which resembled humans appeared. These mindless, towering giants, called \"titans,\" proved to be an existential threat, as they preyed on whatever humans they could find in order to satisfy a seemingly unending appetite. Unable to effectively combat the titans, mankind was forced to barricade themselves within large walls surrounding what may very well be humanity's last safe haven in the world.\n" +
                    "\n" +
                    "In the present day, life within the walls has finally found peace, since the residents have not dealt with titans for many years. Eren Yeager, Mikasa Ackerman, and Armin Arlert are three young children who dream of experiencing all that the world has to offer, having grown up hearing stories of the wonders beyond the walls. But when the state of tranquility is suddenly shattered by the attack of a massive 60-meter titan, they quickly learn just how cruel the world can be. On that day, Eren makes a promise to himself that he will do whatever it takes to eradicate every single titan off the face of the Earth, with the hope that one day, humanity will once again be able to live outside the walls without fear.",

            "Ryuk, a god of death, drops his Death Note into the human world for personal pleasure. In Japan, prodigious high school student Light Yagami stumbles upon it. Inside the notebook, he finds a chilling message: those whose names are written in it shall die. Its nonsensical nature amuses Light; but when he tests its power by writing the name of a criminal in it, they suddenly meet their demise.\n" +
                    "\n" +
                    "Realizing the Death Note's vast potential, Light commences a series of nefarious murders under the pseudonym \"Kira,\" vowing to cleanse the world of corrupt individuals and create a perfect society where crime ceases to exist. However, the police quickly catch on, and they enlist the help of L—a mastermind detective—to uncover the culprit.\n" +
                    "\n" +
                    "Death Note tells the thrilling tale of Light and L as they clash in a great battle-of-minds, one that will determine the future of the world.",

            "Among the seaside town of Izu's ocean waves and rays of shining sun, Iori Kitahara is just beginning his freshman year at Izu University. As he moves into his uncle's scuba diving shop, Grand Blue, he eagerly anticipates his dream college life, filled with beautiful girls and good friends.\n" +
                    "\n" +
                    "But things don't exactly go according to plan. Upon entering the shop, he encounters a group of rowdy, naked upperclassmen, who immediately coerce him into participating in their alcoholic activities. Though unwilling at first, Iori quickly gives in and becomes the heart and soul of the party. Unfortunately, this earns him the scorn of his cousin, Chisa Kotegawa, who walks in at precisely the wrong time. Undeterred, Iori still vows to realize his ideal college life, but will things go according to plan this time, or will his situation take yet another dive?",

            "Considered a genius due to having the highest grades in the country, Miyuki Shirogane leads the prestigious Shuchiin Academy's student council as its president, working alongside the beautiful and wealthy vice president Kaguya Shinomiya. The two are often regarded as the perfect couple by students despite them not being in any sort of romantic relationship.\n" +
                    "\n" +
                    "However, the truth is that after spending so much time together, the two have developed feelings for one another; unfortunately, neither is willing to confess, as doing so would be a sign of weakness. With their pride as elite students on the line, Miyuki and Kaguya embark on a quest to do whatever is necessary to get a confession out of the other. Through their daily antics, the battle of love begins!",

            "The whistle blows. The ball is up. A dig. A set. A spike.\n" +
                    "\n" +
                    "Volleyball. A sport where two teams face off, separated by a formidable, wall-like net.\n" +
                    "\n" +
                    "The \"Little Giant,\" standing at only 170 cm, overcomes the towering net and the wall of blockers. The awe-inspired Shouyou Hinata looks on at the ace's crow-like figure. Determined to reach great heights like the Little Giant, small-statured Hinata finally manages to form a team in his last year of junior high school, and enters his first volleyball tournament. However, his team is utterly defeated in their first game against the powerhouse school Kitagawa Daiichi, led by the genius, but oppressive setter dubbed the \"King of the Court,\" Tobio Kageyama.\n" +
                    "\n" +
                    "Hinata enrolls into Karasuno High School seeking to take revenge against Kageyama in an official high school match and to follow in the Little Giant's footsteps—but his plans are ruined when he opens the gymnasium door to find Kageyama as one of his teammates.\n" +
                    "\n" +
                    "Now, Hinata must establish himself on the team and work alongside the problematic Kageyama to overcome his shortcomings and to fulfill his dream of making it to the top of the high school volleyball world.",

            "The Abyss, a hole of unprecedented depth—one young girl and a robot brave its dangers to find the truth.\n" +
                    "\n" +
                    "The town of Orth is a special one, as it is built around the edges of the massive Abyss, a wonder which has never been fully explored. Those who venture too far down never return, but those brave enough to traverse its territories are known as \"Cave Raiders\" and are heralded as legends. Within this town lives a young girl called Riko, the child of one of the most famous Cave Raiders of all time who disappeared on an expedition many years ago.\n" +
                    "\n" +
                    "One day, Riko's life changes when she meets a strange robot called Regu, who seems to appear from within the Abyss. Believing this to be a sign from her mother stuck at the bottom of the Abyss, Riko descends into its depths with Regu, ready to confront all the dangers within it.",

            "When the responsibilities of being an adult and the ugly side of corporate bullying betrays one's childhood dreams, many would wish to return to their innocent childhood to relive their life and make the right decisions. Dumbfounded by the offer presented to him, 27-year-old Arata Kaizaki hopes to turn his life around through a once-in-a-lifetime opportunity.\n" +
                    "\n" +
                    "Returning home from his part-time job, Arata is persuaded by Ryou Yoake, an employee of ReLife Research Institute, into participating in an experiment which will help him overcome his difficulties and re-enter corporate life. As part of the ReLife experiment, Arata's physique is reverted to that of a 17-year-old, and all he must do is relive his high school life for one year. Waiting for him at the end of the experiment is a job offer that he has been struggling to get ever since he left his first company.\n" +
                    "\n" +
                    "With few other options, he decides to go along with this plan. However, with adult-like tendencies and many years since his last formal education, Arata steps into an unexpectedly challenging territory—a normal day of high school.",

            "Amidst a post-apocalyptic world, Chito and Yuuri seem to be the final survivors of the war that brought civilization to its demise. No longer having a place to live, the girls roam around the city on their half-track motorcycle, ever in search of resources to sustain their vagabond lifestyle. Despite the bleak future ahead of them, the duo still finds ways to entertain themselves throughout this melancholic journey.\n" +
                    "\n" +
                    "Shoujo Shuumatsu Ryokou takes place in a barren world during the harsh winter season. As the happy-go-lucky Yuuri and the serious Chito hopelessly search for a sign of civilization, their expedition may in fact become humanity's last tour.",

            "After rigorously training for three years, the ordinary Saitama has gained immense strength which allows him to take out anyone and anything with just one punch. He decides to put his new skill to good use by becoming a hero. However, he quickly becomes bored with easily defeating monsters, and wants someone to give him a challenge to bring back the spark of being a hero.\n" +
                    "\n" +
                    "Upon bearing witness to Saitama's amazing power, Genos, a cyborg, is determined to become Saitama's apprentice. During this time, Saitama realizes he is neither getting the recognition that he deserves nor known by the people due to him not being a part of the Hero Association. Wanting to boost his reputation, Saitama decides to have Genos register with him, in exchange for taking him in as a pupil. Together, the two begin working their way up toward becoming true heroes, hoping to find strong enemies and earn respect in the process.\n",

            "Ten years ago, \"the Gate\" appeared and connected the real world with the realm of magic and monsters. To combat these vile beasts, ordinary people received superhuman powers and became known as \"Hunters.\" Twenty-year-old Sung Jin-Woo is one such Hunter, but he is known as the \"World's Weakest,\" owing to his pathetic power compared to even a measly E-Rank. Still, he hunts monsters tirelessly in low-rank Gates to pay for his mother's medical bills.\n" +
                    "\n" +
                    "However, this miserable lifestyle changes when Jin-Woo—believing himself to be the only one left to die in a mission gone terribly wrong—awakens in a hospital three days later to find a mysterious screen floating in front of him. This \"Quest Log\" demands that Jin-Woo completes an unrealistic and intense training program, or face an appropriate penalty. Initially reluctant to comply because of the quest's rigor, Jin-Woo soon finds that it may just transform him into one of the world's most fearsome Hunters.",

            "Twenty-Fifth Bam had been alone his whole life until he met Rachel. Now, however, Rachel is set on climbing the Tower, and she is willing to leave Bam behind to do so. After Rachel disappears in a veil of light, Bam follows her, vowing to ascend the Tower in hopes of meeting her again.\n" +
                    "\n" +
                    "But the Tower is a dangerous place full of ancient secrets, fearsome monsters, and nefarious humans. Each floor is protected by an Administrator who puts the daring challengers through grueling tests that will push them to their limits.\n" +
                    "\n" +
                    "As he confronts Headon, the Administrator of the first floor, Bam learns that he is an ''Irregular,'' someone who was not chosen by the Tower but was able to enter it on his own, an extremely rare event inside the Tower. Regardless of this revelation, however, his path forward is clear. Be it wealth, power, glory, or even reuniting with Rachel, all desires will be realized at the top of the Tower.",


    };

    private static String[] mangaAuthor = {
            "Ooima, Yoshitoki (Story & Art)",
            "Isayama, Hajime (Story & Art)",
            "Obata, Takeshi (Art), Ohba, Tsugumi (Story)",
            "Inoue, Kenji (Story), Yoshioka, Kimitake (Art)",
            "Furudate, Haruichi (Story & Art)",
            "Akasaka, Aka (Story & Art)",
            "Tsukushi, Akihito (Story & Art)",
            "Yayoi, Sou (Story & Art)",
            "Tsukumizu (Story & Art)",
            "Murata, Yusuke (Art), ONE (Story)",
            "Chugong (Story), Jang, Sung-rak (Art)",
            "SIU (Story & Art)",
    };

    private static String[] mangaTitles = {
            "A Silent Voice",
            "Attack on Titan",
            "Death Note",
            "Grand Blue Dreaming",
            "Haikyuu!!",
            "Kaguya-sama: Love is War",
            "Made in Abyss",
            "ReLIFE",
            "Girls' Last Tour",
            "One-Punch Man",
            "Solo Leveling",
            "Tower of God",

    };

    private static int[] mangaImages = {
            R.drawable.a_silent_voice,
            R.drawable.attack_on_titan,
            R.drawable.death_note,
            R.drawable.grand_blue,
            R.drawable.haikyuu,
            R.drawable.kaguya_sama,
            R.drawable.made_in_abyss,
            R.drawable.relife,
            R.drawable.girls_last_tour,
            R.drawable.one_punch_man,
            R.drawable.solo_leveling,
            R.drawable.tower_of_god,
    };

    static ArrayList<MangaModel> getListData() {
        ArrayList<MangaModel> list = new ArrayList<>();
        for (int position = 0; position < mangaTitles.length; position++) {
            MangaModel manga = new MangaModel();
            manga.setTitle(mangaTitles[position]);
            manga.setSynopsis(mangaSynopsis[position]);
            manga.setAuthor(mangaAuthor[position]);
            manga.setImage(mangaImages[position]);
            list.add(manga);
        }

        return list;
    }
}
