package handling;

public enum SendPacketOpcode {

    // General
    PING(0x12),
    
    // CLogin::OnPacket (this has been updated.)
    LOGIN_STATUS(0x00),
    SERVERLIST(0x01),
    ENABLE_RECOMMENDED(0x02), 
    SEND_RECOMMENDED(0x03),
    SET_CLIENT_KEY(0x04),
    SELECT_WORLD(0x05),
    CHARLIST(0x06),
    SERVER_IP(0x07), // character select result
    LOGIN_SECOND(0x08),
    CHAR_NAME_RESPONSE(0x0A),
    ADD_NEW_CHAR_ENTRY(0x0B),
    DELETE_CHAR_RESPONSE(0x0C),
    CHANGE_CHANNEL(0x11),
    TOGGLE_CASHSHOP(0x14),
    AUTH_RESPONSE(0x17),
    PART_TIME(0x1D),
    PIC_RESPONSE(0x19),
    SERVERSTATUS(0x26),
    AUTHSERVER(0x2F),
    REGISTER_PIC_RESPONSE(0x1A), // needs updating
    SPECIAL_CREATION(0x20), // needs updating
    SECONDPW_ERROR(0x25), // needs updating
    
    // CWvsContext::OnPacket (this has been updated.)
    INVENTORY_OPERATION(0x47),
    INVENTORY_GROW(0x48),
    UPDATE_STATS(0x49), // OnStatUpdate
    GIVE_BUFF(0x4A),
    CANCEL_BUFF(0x4B),
    TEMP_STATS(0x4C),
    TEMP_STATS_RESET(0x4D),
    UPDATE_SKILLS(0x4E), // OnChangeSkillRecordResult
    UPDATE_STOLEN_SKILLS(0x4F),
    TARGET_SKILL(0x56),
    FAME_RESPONSE(0x58),
    SHOW_STATUS_INFO(0x59),
    SHOW_NOTES(0x5A),
    TROCK_LOCATIONS(0x5B),
    LIE_DETECTOR(0x5C),
    REPORT_RESPONSE(0x5F),
    REPORT_TIME(0x60),
    REPORT_STATUS(0x61),
    UPDATE_MOUNT(0x63),
    SHOW_QUEST_COMPLETION(0x64),
    SEND_TITLE_BOX(0x65),
    USE_SKILL_BOOK(0x66),
    SP_RESET(0x67),
    AP_RESET(0x68),
    EXPAND_CHARACTER_SLOTS(0x6B),
    FINISH_GATHER(0x6D),
    FINISH_SORT(0x6E),
    EXP_POTION(0x43), // needs updating
    CHAR_INFO(0x71),
    PARTY_OPERATION(0x72),
    MEMBER_SEARCH(0x73),
    PARTY_SEARCH(0x5A), // needs updating
    BOOK_INFO(0x5B), // needs updating
    CODEX_INFO_RESPONSE(0x5C), // needs updating
    EXPEDITION_OPERATION(0x7A),
    BUDDYLIST(0x7B),
    GUILD_OPERATION(0x7F),
    ALLIANCE_OPERATION(0x80),
    SPAWN_PORTAL(0x81),
    SERVERMESSAGE(0x82),
    PIGMI_REWARD(0x84),
    OWL_OF_MINERVA(0x86),
    OWL_RESULT(0x87), 
    ENGAGE_REQUEST(0x8A),
    ENGAGE_RESULT(0x8B),
    WEDDING_GIFT(0x8C),
    WEDDING_MAP_TRANSFER(0x8D),
    USE_CASH_PET_FOOD(0x8E),
    YELLOW_CHAT(0x93),
    SHOP_DISCOUNT(0x94),
    CATCH_MOB(0x95),
    PLAYER_NPC(0x97),
    DISABLE_NPC(0x99),
    GET_CARD(0x9A),
    CARD_SET(0x9B),
    BOOK_STATS(0x81), // needs updating
    FAMILIAR_INFO(0x84), // needs updating
    WEB_BOARD_UPDATE(0xA0),
    SESSION_VALUE(0xA1),
    PARTY_VALUE(0xA2),
    MAP_VALUE(0xA3),
    EXP_BONUS(0xA5),
    SEND_PEDIGREE(0xA6),
    OPEN_FAMILY(0xA7),
    FAMILY_MESSAGE(0xA8),
    FAMILY_INVITE(0xA9),
    FAMILY_JUNIOR(0xAA), 
    SENIOR_MESSAGE(0xAB),
    FAMILY(0xAC),
    REP_INCREASE(0xAD),
    FAMILY_LOGGEDIN(0xAE),
    FAMILY_BUFF(0xAF),
    FAMILY_USE_REQUEST(0xB0),
    LEVEL_UPDATE(0xB1),
    MARRIAGE_UPDATE(0xB2),
    JOB_UPDATE(0xB3),
    SLOT_UPDATE(0xB4),
    FOLLOW_REQUEST(0xB5),
    TOP_MSG(0xB7),
    MID_MSG(0xB9),
    CLEAR_MID_MSG(0xBA),
    SPECIAL_MSG(0xBB),
    MAPLE_ADMIN_MSG(0xB5), // needs updating
    UPDATE_JAGUAR(0xC0),
    YOUR_INFORMATION(0xB9), // needs updating
    FIND_FRIEND(0xBA), // needs updating
    VISITOR(0xBB), // needs updating
    ULTIMATE_EXPLORER(0xC4),
	SPECIAL_STAT(0xC6),
    UPDATE_IMP_TIME(0xC7),
    ITEM_POT(0xC8),
    MULUNG_DOJO_RANKING(0xD1),
    REPLACE_SKILLS(0xD5),
    INNER_ABILITY_MSG(0xD8), // needs updating
    ENABLE_INNER_ABILITY(0xD9),
    DISABLE_INNER_ABILITY(0xDA),
    UPDATE_HONOUR(0xDB),
    AZWAN_KILLED(0xDE),
    SILENT_CRUSADE_MSG(0xE2),
    SILENT_CRUSADE_SHOP(0xE3),
    UNLOCK_CHARGE_SKILL(0xFF),
    LOCK_CHARGE_SKILL(0x100),
    EVOLVING_ACTION(0x103),
    CANDY_RANKING(0x108),
    MESSENGER_OPEN(0x10D), // needs updating
    AVATAR_MEGA(0x112),
    AVATAR_MEGA_REMOVE(0x113),
    EVENT_CROWN(0x118),
    USE_ENHANCEMENT(0x13D),
    UPDATE_GENDER(0x17F),
    BBS_OPERATION(0x180),
    CARD_DROPS(0x187),
    GM_POLICE(0x18E),
    GM_STORY_BOARD(0x196),
    PINKBEAN_CHOCO(0x198),
    PAM_SONG(0x199),
    DISALLOW_DELIVERY_QUEST(0x19B),
    MAGIC_WHEEL(0x1A2),
    REWARD(0x1A3),
    SKILL_MACRO(0x1AB),
    SEND_RED_CUBE_REQUEST(0x216), //LP_UserItemRedCubeResult
    SEND_BLACK_CUBE_REQUEST(0x211),
    
    // CStage::OnPacket (this has been updated.)
    WARP_TO_MAP(0x1AC),
    FARM_OPEN(0x1AD),
    CS_OPEN(0x1AF),
    
    // CField::OnPacket (this has been updated.)
    SERVER_BLOCKED(0x1B0),
    PARTY_BLOCKED(0x1B1),
    SHOW_EQUIP_EFFECT(0x1B3),
    MULTICHAT(0x1B4),
    WHISPER(0x1B6),
    SPOUSE_CHAT(0x1B9),
    BOSS_ENV(0x1B8),
    MOVE_ENV(0x1BA),
    UPDATE_ENV(0x1BB),
    MAP_EFFECT(0x1C0),
    CASH_SONG(0x1C1),
    GM_EFFECT(0x1C2),
    OX_QUIZ(0x1C3),
    GMEVENT_INSTRUCTIONS(0x1C4),
    CLOCK(0x1C5),
    BOAT_MOVE(0x1C6),
    BOAT_STATE(0x1C7),
    STOP_CLOCK(0x1CB),
    ARIANT_SCOREBOARD(0x14A), // needs updating
    PYRAMID_UPDATE(0x14E), // needs updating
    PYRAMID_RESULT(0x14F), // needs updating
    QUICK_SLOT(0x1D0), // 0x151   
    MOVE_PLATFORM(0x152), // needs updating
    PYRAMID_KILL_COUNT(0x153), // needs updating
    PVP_INFO(0x1DB), // 0x156
    DIRECTION_STATUS(0x1DC),
    GAIN_FORCE(0x1DD),
    ACHIEVEMENT_RATIO(0x1DE),
    QUICK_MOVE(0x1DF),
    INTRUSION(0x1EA),
    
    // CUserPool::OnPacket (this has been updated.)
    SPAWN_PLAYER(0x204),
    REMOVE_PLAYER_FROM_MAP(0x205),
    
    // CUserPool::OnUserCommonPacket (this has been updated.)
    CHATTEXT(0x206),
    CHALKBOARD(0x207),
    UPDATE_CHAR_BOX(0x208),
    SHOW_CONSUME_EFFECT(0x209),
    SHOW_SCROLL_EFFECT(0x20A),
    SHOW_MAGNIFYING_EFFECT(0x20E),
    SHOW_POTENTIAL_RESET(0x20F), // [60 6e 15 00]itemid? [01] [79 3d 4d 00]cubeitemid
    SHOW_FIREWORKS_EFFECT(0x214),
    SHOW_NEBULITE_EFFECT(0x171), // needs updating
    SHOW_FUSION_EFFECT(0x172), // needs updating
    PVP_ATTACK(0x217),
    PVP_MIST(0x218),
    PVP_COOL(0x219),
    TESLA_TRIANGLE(0x21B),
    FOLLOW_EFFECT(0x21C),
    SHOW_PQ_REWARD(0x21D),
    CRAFT_EFFECT(0x21E),
    CRAFT_COMPLETE(0x21F),
    HARVESTED(0x221),
    PLAYER_DAMAGED(0x223),
    NETT_PYRAMID(0x224),
    PAMS_SONG(0x168), // needs updating
    
    // CUser::OnPetPacket (this has been updated.)
    SPAWN_PET(0x243),
    SPAWN_PET_2(0x192), //  needs updating
    MOVE_PET(0x244),
    PET_CHAT(0x245),
    PET_NAMECHANGE(0x247),
    PET_EXCEPTION_LIST(0x248),
    PET_COLOR(0x249),
    PET_SIZE(0x24A),
    PET_COMMAND(0x24D),
    
    // CUser::OnDragonPacket (this has been updated.)
    DRAGON_SPAWN(0x24E),    
    DRAGON_MOVE(0x24F),
    DRAGON_REMOVE(0x250),
    
    // CUser::OnAndroidPacket (this has been updated.)
    ANDROID_SPAWN(0x252),
    ANDROID_MOVE(0x253),
    ANDROID_EMOTION(0x254),
    ANDROID_UPDATE(0x255),
    ANDROID_DEACTIVATED(0x256),
    
    // CUser::OnFoxManPacket (this has been updated.)
    HAKU_CHANGE_1(0x1A2), // needs updating
    HAKU_CHANGE_0(0x1A5), // needs updating
    SPAWN_HAKU(0x257),
    HAKU_MOVE(0x258),
    HAKU_CHANGE(0x25A),
    
    CHATTEXT_1(0x265),
    
    // CUser::OnFamiliarPacket (this has been updated.)
    SPAWN_FAMILIAR(0x26E),
    MOVE_FAMILIAR(0x26F),
    TOUCH_FAMILIAR(0x270),
    ATTACK_FAMILIAR(0x271),
    RENAME_FAMILIAR(0x272),
    SPAWN_FAMILIAR_2(0x273),
    UPDATE_FAMILIAR(0x274),
    
    // CUserPool::OnUserRemotePacket (this has been updated.)
    MOVE_PLAYER(0x279),
    CLOSE_RANGE_ATTACK(0x27a),
    RANGED_ATTACK(0x27b),
    MAGIC_ATTACK(0x27c),
    ENERGY_ATTACK(0x27d),
    SKILL_EFFECT(0x27e),
    MOVE_ATTACK(0x27f),
    CANCEL_SKILL_EFFECT(0x280),
    DAMAGE_PLAYER(0x281),
    FACIAL_EXPRESSION(0x282),
    SHOW_EFFECT(0x284),
    SHOW_TITLE(0x286),
    ANGELIC_CHANGE(0x287),
    SHOW_CHAIR(0x28A),
    UPDATE_CHAR_LOOK(0x28B),
    SHOW_FOREIGN_EFFECT(0x28C),
    GIVE_FOREIGN_BUFF(0x28D),
    CANCEL_FOREIGN_BUFF(0x28E),
    UPDATE_PARTYMEMBER_HP(0x28F),
    LOAD_GUILD_NAME(0x290),
    LOAD_GUILD_ICON(0x291),
    LOAD_TEAM(0x292),
    SHOW_HARVEST(0x293),
    PVP_HP(0x1D7), // needs updating
    CANCEL_CHAIR(0x22B), // needs updating
    
    INNER_ABILITY_RESET_MSG(0x2CF),
    
    // CUserPool::OnUserLocalPacket (this has been updated.)
    DIRECTION_FACIAL_EXPRESSION(0x2AD),
    MOVE_SCREEN(0x2AE),
    SHOW_SPECIAL_EFFECT(0x2AF),
    CURRENT_MAP_WARP(0x2B0),
    MESOBAG_SUCCESS(0x2B2),
    MESOBAG_FAILURE(0x2B3),
    UPDATE_QUEST_INFO(0x2B4),
    HP_DECREASE(0x2B5),
    PLAYER_HINT(0x2B7),
    PLAY_EVENT_SOUND(0x2B8),
    PLAY_MINIGAME_SOUND(0x2B9),
    MAKER_SKILL(0x2BA),
    OPEN_UI(0x2BD),
    OPEN_UI_OPTION(0x2BF),
    INTRO_LOCK(0x2C1),
    INTRO_ENABLE_UI(0x2C2),
    INTRO_DISABLE_UI(0x2C3),
    SUMMON_HINT(0x2C4),
    SUMMON_HINT_MSG(0x2C5),
    ARAN_COMBO(0x2CB),
    ARAN_COMBO_RECHARGE(0x2CC),
    RADIO_SCHEDULE(0x2CD),
    OPEN_SKILL_GUIDE(0x2CE),
    GAME_MSG(0x2CF),
    GAME_MESSAGE(0x2D0),
    BUFF_ZONE_EFFECT(0x2D2),
    TIME_BOMB_ATTACK(0x2D3),
    FOLLOW_MOVE(0x2D5),
    FOLLOW_MSG(0x2D6),
    HARVEST_MESSAGE(0x2D9),
    OPEN_BAG(0x2DB),
    DRAGON_BLINK(0x2DC),
    PVP_ICEGAGE(0x2DD),
    DIRECTION_INFO(0x2DE),
    REISSUE_MEDAL(0x2DF),
    PLAY_MOVIE(0x2E2),
    PHANTOM_CARD(0x2E4),
    LUMINOUS_COMBO(0x2E7),
    MOVE_SCREEN_X(0x1AC),
    MOVE_SCREEN_DOWN(0x1AD),
    SEALED_BOX(0x225), // needs updating.
    COOLDOWN(0x336),
    R_MESOBAG_SUCCESS(0x34F),
    R_MESOBAG_FAILURE(0x350),
    MAP_FADE(0x351),
    MAP_FADE_FORCE(0x352),
    REGISTER_FAMILIAR(0x35E),
    FAMILIAR_MESSAGE(0x35F),
    CREATE_ULTIMATE(0x360), // needs testing	
    
    // CSummonedPool::OnPacket (this has been updated.)
    SPAWN_SUMMON(0x37C),
    REMOVE_SUMMON(0x37D),
    MOVE_SUMMON(0x37E),
    SUMMON_ATTACK(0x37F),
    PVP_SUMMON(0x380),
    SUMMON_SKILL(0x381),
    SUMMON_SKILL_2(0x382),
    DAMAGE_SUMMON(0x383), // needs testing
    
    // CMobPool::OnPacket (this has been updated.)
    SPAWN_MONSTER(0x38C),
    KILL_MONSTER(0x38D),
    SPAWN_MONSTER_CONTROL(0x38E),
    
    // CMobPool::OnMobPacket (this has been updated.)
    MOVE_MONSTER(0x392),
    MOVE_MONSTER_RESPONSE(0x393),
    APPLY_MONSTER_STATUS(0x395),
    CANCEL_MONSTER_STATUS(0x396),
    DAMAGE_MONSTER(0x399),
    SKILL_EFFECT_MOB(0x39A),
    TELE_MONSTER(0x3AB), // needs updating.
    MONSTER_SKILL(0x39D), // needs updating.
    SHOW_MONSTER_HP(0x39E),
    SHOW_MAGNET(0x39F),
    ITEM_EFFECT_MOB(0x3A0),
    CATCH_MONSTER(0x3A1),
    MONSTER_PROPERTIES(0x3A5),
    REMOVE_TALK_MONSTER(0x3A7),
    TALK_MONSTER(0x1BE), // needs updating
    CYGNUS_ATTACK(0x3AC), // ?
    MONSTER_RESIST(0x3AF), 
    MOB_TO_MOB_DAMAGE(0x3D2),
    AZWAN_MOB_TO_MOB_DAMAGE(0x1CC), // needs updating
    AZWAN_SPAWN_MONSTER(0x99C), // needs updating
    AZWAN_KILL_MONSTER(0x99C), // needs updating
    AZWAN_SPAWN_MONSTER_CONTROL(0x99C), // needs updating

    // CNpcPool::OnPacket (this has been updated.)
    SPAWN_NPC(0x3D8),
    REMOVE_NPC(0x3D9),
    SPAWN_NPC_REQUEST_CONTROLLER(0x3DB),
    NPC_ACTION(0x3DC),
    NPC_TOGGLE_VISIBLE(0x3DD),
    INITIAL_QUIZ(0x3DF),
    NPC_UPDATE_LIMITED_INFO(0x3E0),
    NPC_SET_SPECIAL_ACTION(0x3E2),
    NPC_SCRIPTABLE(0x3E3), 
    RED_LEAF_HIGH(0x3E4),
    
    // CEmployeePool::OnPacket (this has been updated.)
    SPAWN_HIRED_MERCHANT(0x3EE),
    DESTROY_HIRED_MERCHANT(0x3EF),
    UPDATE_HIRED_MERCHANT(0x3F0),
    
    // CDropPool::OnPacket (this has been updated.)
    DROP_ITEM_FROM_MAPOBJECT(0x3F1),
    REMOVE_ITEM_FROM_MAP(0x3F3),
    
    // CMessageBoxPool::OnPacket (this has been updated.)
    SPAWN_KITE_ERROR(0x3F4),
    SPAWN_KITE(0x3F5),
    DESTROY_KITE(0x3F6),
    
    // CAffectedAreaPool::OnPacket (this has been updated.)
    SPAWN_MIST(0x3F8),
    REMOVE_MIST(0x3F9),
    
    // CTownPortalPool::OnPacket (this has been updated.)
    SPAWN_DOOR(0x3FA),
    REMOVE_DOOR(0x3FB),
    
    // COpenGatePool::OnPacket (this has been updated.)
    MECH_DOOR_SPAWN(0x3FF),
    MECH_DOOR_REMOVE(0x400),
    
    // CReactorPool::OnPacket (this has been updated.)
    REACTOR_HIT(0x402),
    REACTOR_MOVE(0x403),
    REACTOR_SPAWN(0x404),
    REACTOR_DESTROY(0x408),
    
    // CFishingZonePool::OnPacket (this has been updated.)
    FISHING_INFO(0x409),
    FISHING_REWARD(0x40A),
    FISHING_ZONE_INFO(0x40B),
    
    // CExtractor::OnPacket ( this has been updated.)
    SPAWN_EXTRACTOR(0x40C),
    REMOVE_EXTRACTOR(0x40D),
    
    // Snowball::OnPacket (this has been updated.)
    ROLL_SNOWBALL(0x40E),
    HIT_SNOWBALL(0x40F),
    SNOWBALL_MESSAGE(0x410),
    LEFT_KNOCK_BACK(0x411),
    
    // Coconut::OnPacket (this has been updated.)
    HIT_COCONUT(0x412),
    COCONUT_SCORE(0x413),
    MOVE_HEALER(0x414),
    PULLEY_STATE(0x415),
    
    // CField_MonsterCarnival::OnPacket (this has been updated.)
    MONSTER_CARNIVAL_START(0x416),
    MONSTER_CARNIVAL_OBTAINED_CP(0x417),
    MONSTER_CARNIVAL_STATS(0x418),
    MONSTER_CARNIVAL_SUMMON(0x2D0),
    MONSTER_CARNIVAL_MESSAGE(0x41B),
    MONSTER_CARNIVAL_DIED(0x41C),
    MONSTER_CARNIVAL_LEAVE(0x41D),
    MONSTER_CARNIVAL_RESULT(0x41E),
    MONSTER_CARNIVAL_RANKING(0x41F),
    
    // CField_Witchtower::OnPacket (this has been updated.)
    WITCH_TOWER(0x424),
    
    // CField_PvP::OnPacket (this has been updated.)
    ENTER_PVP(0x426),
    CHANGE_TEAM(0x427),
    CHANGE_MODE(0x428),
    CHANGE_STATE(0x429),
    UPDATE_COUNT(0x42A),
    SHOW_MODE_RESULT(0x42B),
    UPDATE_TEAM_INFO(0x42C),
    UPDATE_RANK_INFO(0x42D),
    UPDATE_TEAM_SCORE(0x42F),
    REVIVE_MESSAGE(0x430),
    SCREEN_EFFECT(0x431),
    ICEKNIGHT_HP_CHANGE(0x432),
    
    // CScriptMan::OnPacket (this has been updated.)
    NPC_TALK(0x501),
    
    // CShopDlg::OnPacket (this has been updated.)
    OPEN_NPC_SHOP(0x502),
    CONFIRM_SHOP_TRANSACTION(0x503),
    
    // CStoreBankDlg::OnPacket (this has been updated.)
    OPEN_STORAGE(0x347),
    MERCH_ITEM_MSG(0x348),
    MERCH_ITEM_STORE(0x349),
    
    // CCashShop::OnPacket (this has been updated.)
    CS_UPDATE(0x53D),
    CS_OPERATION(0x53E),
    PURCHASE_EXP_CHANGED(0x53F),
    CS_MESO_UPDATE(0x541),
    GACHAPON_STAMPS(0x54C),
    FREE_CASH_ITEM(0x54D),
    CS_SURPRISE(0x54E),
    XMAS_SURPRISE(0x54F),
    CASH_SHOP(0x555),
    CASH_SHOP_UPDATE(0x556),
    ONE_A_DAY(0x54E),
    
    // CFuncKeyMappedMan::OnPacket (this has been updated.)
    KEYMAP(0x591),
    PET_AUTO_HP(0x592),
    PET_AUTO_MP(0x593),
    PET_AUTO_CURE(0x594),
    
    // CMapleTVMan::OnPacket (this has been updated.)
    START_TV(0x598),
    REMOVE_TV(0x599),
    ENABLE_TV(0x59A),
    
    // CMonsterFarm::OnPacket (this has been updated.)
    UPDATE_FARM_INVENTORY(0x5D8),
    CONSOLE_MESSAGE(0x5D9),
    OBJECT_INTERACT(0x5DA),
    OBJECT_CONSUME(0x5DB),
    RESULT_DICTIONARY(0x5DC),
    UPDATE_BUY_OBJECT(0x5DD),
    UPDATE_SEL_OBJECT(0x5DE),
    COMBINE_RESULT(0x5DF),
    FARM_MONSTER_SEARCH_RESULT(0x5E0),
    FARM_VISIT_RESULT(0x5E1),
    UPDATE_NEWS_FEED(0x5E2),
    UPDATE_DICTIONARY(0x5E3),
    AUTO_HARVEST_RESULT(0x5E4),
    SOUL_RECHARGE_RESULT(0x5E5),
    
    // CFarmUser::OnPacket (this has been updated.)
    SET_FARM_USER(0x5E8),
    SET_FARM_INVENTORY(0x5E9),
    SET_FARM_QUEST_ALL(0x5EA),
    QUEST_MESSAGE(0x5EB),
    NOTICE_MESSAGE(0x5EC),
    UPDATE_MONSTER_LIST(0x5ED),
    UPDATE_DECO(0x5EE),
    UPDATE_POINT(0x5EF),
    UPDATE_CASH(0x5F0),
    UPDATE_THEME(0x5F1),
    UPDATE_MONSTER_SLOT(0x5F2),
    UPDATE_MONSTER_LOCKER_SLOT(0x5F3),
    UPDATE_EXP(0x5F4),
    RESULT_CHECK_NAME(0x5F5),
    RESULT_CHECK_NAME_BY_CONSUME(0x5F6),
    RESULT_COMPLETE_QUEST(0x5F7),
    RESULT_GET_USER_PHOTO(0x5F8),
    RESULT_UPDATE_PHOTO(0x5F9),
    RESULT_REFULL_DAILY_QUEST(0x5FA),
    SEND_FARM_GIFT(0x5FB),
    SET_FRIEND_LIST( 0x5FC),
    FRIEND_ONLINE_REFRESH(0x5FD),
    RESULT_ADD_FRIEND(0x5FE),
    RESULT_SEND_NOTICE(0x5FF),
    RESULT_LOAD_MAIN_LOG(0x600),
    RESULT_ADD_BLACKLIST(0x601),
    RESULT_FARM_USER_INFO_UI(0x602),
    SET_GUEST_OWNER_INFO(0x603),
    FARM_WHISPER(0x604),
    GROUP_MESSAGE(0x605),
    FARM_BROADCAST_MESSAGE(0x606),
    RESULT_NEW_LIST(0x607),
    SET_INGAME_INFO(0x608),
    FORCED_SHOP_OPEN(0x609),
    REQUEST_SET_INGAME_INFO(0x60A),
    INGAME_FRIEND_REQUEST_RESULT(0x60C),
    WORLD_WHISPER_RESULT(0x60E),
    TOTAL_INFO(0x60F),
    
    // CFarmMonsterPool::OnPacket (this has been updated.)
    ON_INSERT(0x612),
    ON_UPDATE(0x613),
    UPDATE_MY(0x614),
    SET_NAME_RESULT(0x615),
    CARE_RESULT(0x616),
    PLAY_RESULT(0x617),
    RELEASE_RESULT(0x618),
    LOCKER_RESULT(0x619),
    LIFE_EXTEND_RESULT(0x61A),
    
    //Unplaced:
    MAPLE_POINT(0xED), // E6
    DEATH_COUNT(0x206),
	
	// Unknown
    SHOW_DAMAGE_SKIN(0x999),
    BOOSTER_PACK(0x999),
    BOOSTER_FAMILIAR(0x999),
    PET_FLAG_CHANGE(0x999),
    BUFF_BAR(0x999),
    CHAOS_ZAKUM_SHRINE(0x999),
    HORNTAIL_SHRINE(0x999),
    CAPTURE_FLAGS(0x999),
    CAPTURE_POSITION(0x999),
    CAPTURE_RESET(0x999),
    STRENGTHEN_UI(0x999),
    ALIEN_SOCKET_CREATOR(0x999),
    GOLDEN_HAMMER(0x999),
    RPS_GAME(0x999),
    MESSENGER(0x999),
    PLAYER_INTERACTION(0x999),
    VICIOUS_HAMMER(0x999),
    LOGOUT_GIFT(0x999),
    PACKAGE_OPERATION(0x999);

    private short code = -2;

    public void setValue(short code) {
        this.code = code;
    }
    
    public void setValue(int code) {
    	setValue((short) code);
    }

    public short getValue() {
        return code;
    }

    private SendPacketOpcode(short code) {
        this.code = code;
    }
    
    private SendPacketOpcode(int code) {
    	this.code = ((short) code);
    }
    
	public static String getNameByValue(int value) {
		for (SendPacketOpcode opcode : SendPacketOpcode.values()) {
			if (opcode.getValue() == value) {
				return opcode.name();
			}
		}
		return "UNKNOWN";
	}
}
