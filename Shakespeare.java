import java.util.Random;

public class Shakespeare{

	public static void main(String[] args){
	Random r = new Random();
        //column 1
        String column1[] = new String[]{
            "artless "
            ,"bawdy "
            ,"beslubbering "
            ,"bootless "
            ,"churlish "
            ,"cockered "
            ,"clouted "
            ,"craven "
            ,"currish "
            ,"dankish "
            ,"dissembling "
            ,"droning "
            ,"errant "
            ,"fawning "
            ,"fobbing "
            ,"froward "
            ,"frothy "
            ,"gleeking "
            ,"goatish "
            ,"gorbellied "
            ,"impertinent "
            ,"infectious "
            ,"jarring "
            ,"loggerheaded "
            ,"lumpish "
            ,"mammering "
            ,"mangled "
            ,"mewling "
            ,"paunchy"
            ,"pribbling "
            ,"puking "
            ,"puny "
            ,"qualling "
            ,"rank "
            ,"reeky "
            ,"roguish "
            ,"ruttish "
            ,"saucy "
            ,"spleeny "
            ,"spongy "
            ,"surly "
            ,"tottering "
            ,"unmuzzled "
            ,"vain "
            ,"venomed "
            ,"villainous "
            ,"warped "
            ,"wayward "
            ,"weedy "
            ,"yeasty "
    };
        int choice1 = 1 + r.nextInt(column1.length);
        //column2
        String column2[] = new String[]{
            "base-court "
            ,"bat-fowling "
            ,"beef-witted "
            ,"beetle-headed "
            ,"clapper-clawed "
            ,"clay-brained "
            ,"common-kissing "
            ,"crook-pated "
            ,"dismal-dreaming "
            ,"dizzy-eyed "
            ,"doghearted "
            ,"dread-bolted "
            ,"earth-vexing "
            ,"elf-skinned "
            ,"fat-kidneyed "
            ,"fen-sucked "
            ,"flap-mouthed "
            ,"fly-bitten "
            ,"folly-fallen "
            ,"fool-born "
            ,"full-gorged "
            ,"guts-griping "
            ,"half-faced "
            ,"hasty-witted "
            ,"hedge-born "
            ,"hell-hated "
            ,"idle-headed "
            ,"ill-breeding "
            ,"ill-nutured "
            ,"knotty-pated "
            ,"milk-livered "
            ,"motley-minded "
            ,"onion-eyed "
            ,"plume-plucked "
            ,"pottle-deep "
            ,"pox-marked "
            ,"reeling-ripe "
            ,"rough-hewn "
            ,"rude-growing "
            ,"rump-fed "
            ,"shard-borne "
            ,"sheep-biting "
            ,"spur-galled "
            ,"swag-bellied "
            ,"tardy-gaited "
            ,"tickle-brained "
            ,"toad-spotted "
            ,"unchin-snouted "
            ,"weather-bitten "
            ,"boil-brained "
        };
        int choice2 = 1 + r.nextInt(column2.length);

        //column 3
        String column3[] = new String[]{
                "apple-john"
                ,"baggage"
                ,"barnacle"
                ,"bladder"
                ,"boar-pig"
                ,"bugbear"
                ,"bum-bailey"
                ,"canker-blossom"
                ,"clack-dish"
                ,"clotpole"
                ,"coxcomb"
                ,"codpiece"
                ,"death-token"
                ,"dewberry"
                ,"flap-dragon"
                ,"flax-wench"
                ,"flirt-gill"
                ,"foot-licker"
                ,"fustilarian"
                ,"giglet"
                ,"gudgeon"
                ,"haggard"
                ,"harpy"
                ,"hedge-pig"
                ,"horn-beast"
                ,"hugger-mugger"
                ,"joithead"
                ,"lewdster"
                ,"lout"
                ,"maggot-pie"
                ,"malt-worm"
                ,"mammet"
                ,"measle"
                ,"minnow"
                ,"miscreant"
                ,"mold-warp"
                ,"mumble-news"
                ,"nut-hook"
                ,"piegon egg"
                ,"pignut"
                ,"puttock"
                ,"pumpion"
                ,"ratsbane"
                ,"scut"
                ,"skainsmate"
                ,"strumpet"
                ,"varlot"
                ,"vassal"
                ,"whey-face"
                ,"wagtail"
        };
        int choice3 = 1 + r.nextInt(column3.length);

        String output = "Thou " + column1[choice1] + column2[choice2] + column3[choice3] + "!";
        System.out.println(output);
	}
}
