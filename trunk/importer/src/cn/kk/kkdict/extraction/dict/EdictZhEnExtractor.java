/*  Copyright (c) 2010 Xiaoyun Zhu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy  
 *  of this software and associated documentation files (the "Software"), to deal  
 *  in the Software without restriction, including without limitation the rights  
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 *  copies of the Software, and to permit persons to whom the Software is  
 *  furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in  
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN  
 *  THE SOFTWARE.  
 */
package cn.kk.kkdict.extraction.dict;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import cn.kk.kkdict.Configuration;
import cn.kk.kkdict.Configuration.Source;
import cn.kk.kkdict.types.Category;
import cn.kk.kkdict.types.Language;
import cn.kk.kkdict.types.TranslationSource;
import cn.kk.kkdict.types.Usage;
import cn.kk.kkdict.types.WordType;
import cn.kk.kkdict.utils.Helper;

/**
 * Download: http://www.mdbg.net/chindict/chindict.php?page=cc-cedict
 * 
 * @author x_kez
 * 
 */
public class EdictZhEnExtractor extends EdictZhDeExtractor {
  public static final String   EDICT_ZH_EN_FILE               = Configuration.IMPORTER_FOLDER_SELECTED_DICTS.getFile(Source.DICT_EDICT, "cedict_ts.u8");

  public static final String   OUT_DIR_ZH_EN                  = Configuration.IMPORTER_FOLDER_EXTRACTED_DICTS.getPath(Source.DICT_EDICT);

  public static final String[] IRRELEVANT_WORDS_STRINGS_ZH_EN = {};

  public static void main(final String args[]) throws IOException {
    final Map<String, EdictCategory> categoriesMap = new HashMap<>();
    final CategoryImpl[] values = CategoryImpl.values();
    for (int i = 0; i < values.length; i++) {
      final CategoryImpl c = values[i];
      categoriesMap.put(c.getConstantName(), c);
    }
    new EdictZhEnExtractor().extractDict(TranslationSource.EDICT_ZH_EN, EdictZhEnExtractor.EDICT_ZH_EN_FILE, Helper.CHARSET_UTF8,
        EdictZhEnExtractor.OUT_DIR_ZH_EN, Language.ZH, Language.EN, categoriesMap, EdictZhEnExtractor.IRRELEVANT_WORDS_STRINGS_ZH_EN);
  }

  public static enum CategoryImpl implements EdictZhDeExtractor.EdictCategory {
    Buddhism(null, Category.TYPE_ID + Category.RELIGION.key),
    Buddhist(null, Category.TYPE_ID + Category.RELIGION.key),
    Cantonese(null, null),
    China(null, Category.TYPE_ID + Category.NAME.key),
    Chinese_constellation(null, null),
    Chinese_poet(null, Category.TYPE_ID + Category.PEOPLE.key),
    English(null, null),
    English_surname(null, Category.TYPE_ID + Category.PEOPLE.key),
    GM(null, null),
    Germany(null, Category.TYPE_ID + Category.NAME.key),
    Hong_Kong(null, Category.TYPE_ID + Category.NAME.key),
    M(null, null),
    N(null, null),
    South_Korea(null, Category.TYPE_ID + Category.NAME.key),
    Taiwan(null, Category.TYPE_ID + Category.NAME.key),
    Tibet(null, Category.TYPE_ID + Category.NAME.key),
    a(null, null),
    a_child(null, Category.TYPE_ID + Category.PEOPLE.key),
    a_measure_word(null, null),
    a_person(null, Category.TYPE_ID + Category.PEOPLE.key),
    a_person_s_name(null, Category.TYPE_ID + Category.PEOPLE.key),
    a_personal_name(null, Category.TYPE_ID + Category.PEOPLE.key),
    a_surname(null, Category.TYPE_ID + Category.PEOPLE.key),
    a_time(null, Category.TYPE_ID + Category.TIME.key),
    abbr(null, WordType.TYPE_ID + WordType.ABBREVIATION.key),
    abbrev(null, WordType.TYPE_ID + WordType.ABBREVIATION.key),
    abbreviation_for(null, null),
    adj(null, WordType.TYPE_ID + WordType.ADJECTIVE.key),
    adv(null, WordType.TYPE_ID + WordType.ADVERB.key),
    against(null, null),
    aircraft(null, Category.TYPE_ID + Category.AERIAL.key),
    an_agreement(null, Category.TYPE_ID + Category.LAW.key),
    an_issue(null, null),
    area_in_Hebei(null, Category.TYPE_ID + Category.NAME.key),
    area_in_Hong_Kong(null, Category.TYPE_ID + Category.NAME.key),
    area_in_Shandong(null, Category.TYPE_ID + Category.NAME.key),
    area_in_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    area_in_Taiwan(null, Category.TYPE_ID + Category.NAME.key),
    as_a_horse(null, null),
    as_of_water(null, null),
    bamboo(null, Category.TYPE_ID + Category.PLANTS.key),
    bandits(null, Category.TYPE_ID + Category.LAW.key),
    bank(null, Category.TYPE_ID + Category.ECONOMY.key),
    be(null, null),
    biol(null, Category.TYPE_ID + Category.BIOLOGY.key),
    brush_movement_in_painting(null, Category.TYPE_ID + Category.ARTS.key),
    brush_stroke_in_painting(null, Category.TYPE_ID + Category.ARTS.key),
    business(null, Category.TYPE_ID + Category.ECONOMY.key),
    chem(null, Category.TYPE_ID + Category.CHEMISTRY.key),
    city(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Anhui(null, Category.TYPE_ID + Category.NAME.key),
    city_in_France(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Fujian(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Gansu(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Germany(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Guangdong(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Guangxi(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Guizhou(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Hainan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Hebei(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Heilongjiang(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Henan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Hubei(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Hunan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Inner_Mongolia(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Jiangsu(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Jiangxi(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Jilin(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Liaoning(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Ningxia(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Russia(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Shaanxi(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Shandong(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Shanxi(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_South_Korea(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Switzerland(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Taiwan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Xinjiang(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Yunnan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Zhejiang(null, Category.TYPE_ID + Category.NAME.key),
    classical(null, null),
    clothes(null, Category.TYPE_ID + Category.COSMETICS.key),
    cloud(null, Category.TYPE_ID + Category.GEOGRAPHY.key),
    coffee(null, Category.TYPE_ID + Category.CUISINE.key),
    color(null, Category.TYPE_ID + Category.ARTS.key),
    computer(null, Category.TYPE_ID + Category.SOFTWARE.key),
    computer_science(null, Category.TYPE_ID + Category.SOFTWARE.key),
    computing(null, Category.TYPE_ID + Category.SOFTWARE.key),
    conj(null, WordType.TYPE_ID + WordType.CONJUNCTION.key),
    constellation(null, null),
    county_in_Anhui(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Beijing(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Gansu(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Guangdong(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Guangxi(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Guizhou(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Hainan(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Hebei(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Henan(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Hubei(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Hunan(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Jiangsu(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Liaoning(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Qinghai(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Shaanxi(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Shandong(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Shanxi(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Tianjin(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Yunnan(null, Category.TYPE_ID + Category.NAME.key),
    derogatory(null, null),
    district_in_Anhui(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Fujian(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Gansu(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Guangdong(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Guangxi(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Guizhou(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Hebei(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Heilongjiang(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Henan(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Hubei(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Hunan(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Jiangsu(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Jiangxi(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Jilin(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Shaanxi(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Shandong(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Tibet(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Xinjiang(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Yunnan(null, Category.TYPE_ID + Category.NAME.key),
    district_in_Zhejiang(null, Category.TYPE_ID + Category.NAME.key),
    do_something(null, null),
    eg(null, null),
    economic(null, Category.TYPE_ID + Category.ECONOMY.key),
    electric(null, Category.TYPE_ID + Category.PHYSICS.key),
    electronics(null, Category.TYPE_ID + Category.TECHNOLOGY.key),
    etc(null, null),
    family(null, Category.TYPE_ID + Category.PEOPLE.key),
    final_part(null, null),
    financial(null, Category.TYPE_ID + Category.ECONOMY.key),
    fish(null, Category.TYPE_ID + Category.ANIMALS.key),
    fraud_proof(null, null),
    from(null, null),
    fruit(null, Category.TYPE_ID + Category.CUISINE.key),
    gas(null, null),
    gem(null, null),
    geol(null, null),
    geological_period(null, Category.TYPE_ID + Category.GEOGRAPHY.key),
    geology(null, Category.TYPE_ID + Category.GEOGRAPHY.key),
    geom(null, null),
    geometry(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    grass(null, Category.TYPE_ID + Category.PLANTS.key),
    hair(null, Category.TYPE_ID + Category.MEDICINE.key),
    herb(null, Category.TYPE_ID + Category.PLANTS.key),
    horse(null, Category.TYPE_ID + Category.ANIMALS.key),
    ie(null, null),
    idiom(null, null),
    in(null, null),
    in_Beijing(null, Category.TYPE_ID + Category.NAME.key),
    in_Guangdong_province(null, Category.TYPE_ID + Category.NAME.key),
    in_sth(null, null),
    informal(null, Usage.TYPE_ID + Usage.COLLOQUIAL.key),
    information(null, null),
    insect(null, null),
    interj(null, WordType.TYPE_ID + WordType.INTERJECTION.key),
    interrog_part(null, null),
    jade(null, null),
    judicial(null, Usage.TYPE_ID + Usage.JUDICIAL.key),
    land(null, null),
    language(null, Category.TYPE_ID + Category.LITERATURE.key),
    legal(null, null),
    lit(null, Usage.TYPE_ID + Usage.FORMAL.key),
    ly(null, null),
    make_a(null, null),
    material(null, Category.TYPE_ID + Category.CHEMISTRY.key),
    math(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    math_phys(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    mathematics(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    measure_word(null, null),
    med(null, null),
    military(null, Category.TYPE_ID + Category.MILITARY.key),
    mineral(null, Category.TYPE_ID + Category.CHEMISTRY.key),
    money(null, Category.TYPE_ID + Category.ECONOMY.key),
    mus_instr(null, Category.TYPE_ID + Category.MUSIC.key),
    music(null, Category.TYPE_ID + Category.MUSIC.key),
    music_genre(null, Category.TYPE_ID + Category.MUSIC.key),
    mythical_animal(null, Category.TYPE_ID + Category.MYTHOLOGY.key),
    n(null, WordType.TYPE_ID + WordType.NOUN.key),
    name(null, Category.TYPE_ID + Category.NAME.key),
    networking(null, Category.TYPE_ID + Category.SOFTWARE.key),
    news(null, Category.TYPE_ID + Category.MEDIA.key),
    newspaper(null, Category.TYPE_ID + Category.MEDIA.key),
    not(null, null),
    of(null, null),
    of_a_country(null, null),
    of_a_disease(null, null),
    of_fire(null, null),
    of_sth(null, null),
    of_water(null, null),
    onomat(null, null),
    over(null, null),
    person(null, Category.TYPE_ID + Category.PEOPLE.key),
    person_name(null, Category.TYPE_ID + Category.PEOPLE.key),
    philosopher(null, Category.TYPE_ID + Category.PHILOSOPHY.key),
    phonetic(null, null),
    phr(null, null),
    phys(null, Category.TYPE_ID + Category.PHYSICS.key),
    physics(null, Category.TYPE_ID + Category.PHYSICS.key),
    place_in_Anhui(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Beijing(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Fujian(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Gansu(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Guangdong(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Guangxi(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Guizhou(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Hainan(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Hebei(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Heilongjiang(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Henan(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Hubei(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Hunan(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Inner_Mongolia(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Jiangsu(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Jiangxi(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Jilin(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Liaoning(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Ningxia(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Qinghai(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Shaanxi(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Shandong(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Shanghai(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Shanxi(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Tianjin(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Tibet(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Xinjiang(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Yunnan(null, Category.TYPE_ID + Category.NAME.key),
    place_in_Zhejiang(null, Category.TYPE_ID + Category.NAME.key),
    planet(null, Category.TYPE_ID + Category.ASTRONOMY.key),
    policy(null, null),
    political(null, Category.TYPE_ID + Category.POLITICS.key),
    politically(null, Category.TYPE_ID + Category.POLITICS.key),
    pres_Sichuan(null, Category.TYPE_ID + Category.NAME.key),
    proper_name(null, null),
    psychoanalyst(null, Category.TYPE_ID + Category.PSYCHOLOGY.key),
    river(null, Category.TYPE_ID + Category.NAME.key),
    s(null, null),
    saying(null, null),
    sb(null, null),
    scientific(null, Category.TYPE_ID + Category.TECHNOLOGY.key),
    slang(null, null),
    software(null, Category.TYPE_ID + Category.SOFTWARE.key),
    someone(null, null),
    something(null, null),
    sound(null, Category.TYPE_ID + Category.MUSIC.key),
    sport(null, Category.TYPE_ID + Category.SPORTS.key),
    sports(null, Category.TYPE_ID + Category.SPORTS.key),
    star(null, Category.TYPE_ID + Category.ASTRONOMY.key),
    state(null, Category.TYPE_ID + Category.NAME.key),
    state_in_India(null, Category.TYPE_ID + Category.NAME.key),
    statistics(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    sth(null, null),
    surname(null, Category.TYPE_ID + Category.PEOPLE.key),
    taxonomy(null, null),
    telephone(null, Category.TYPE_ID + Category.COMMUNICATION.key),
    that(null, null),
    the(null, null),
    thing(null, null),
    time(null, Category.TYPE_ID + Category.TIME.key),
    to(null, null),
    to_be(null, null),
    to_do_something(null, null),
    to_do_sth(null, null),
    to_sth(null, null),
    town_in_Kham_prov_of_Tibet(null, Category.TYPE_ID + Category.NAME.key),
    town_in_Taiwan(null, Category.TYPE_ID + Category.NAME.key),
    town_in_central_Tibet(null, Category.TYPE_ID + Category.NAME.key),
    tree(null, Category.TYPE_ID + Category.PLANTS.key),
    troops(null, null),
    tw(null, null),
    unit_of_currency(null, null),
    up(null, null),
    use(null, null),
    v(null, WordType.TYPE_ID + WordType.VERB.key),
    vi(null, null),
    village_in_Taiwan(null, Category.TYPE_ID + Category.NAME.key),
    vt(null, null),
    water(null, null),
    weapon(null, Category.TYPE_ID + Category.MILITARY.key),
    writing(null, null),
    FOR(null, null),
    monastery_near_Lhasa(null, Category.TYPE_ID + Category.NAME.key),
    rights(null, Category.TYPE_ID + Category.LAW.key),
    week(null, Category.TYPE_ID + Category.TIME.key),
    _UK_and_US_Navy_equivalent(null, null),
    Australia(null, Category.TYPE_ID + Category.NAME.key),
    Chinese_philosopher(null, Category.TYPE_ID + Category.PEOPLE.key),
    Chinese_surname(null, Category.TYPE_ID + Category.PEOPLE.key),
    Chinese_warlord(null, Category.TYPE_ID + Category.PEOPLE.key),
    Chinese_writer(null, Category.TYPE_ID + Category.PEOPLE.key),
    HIV(null, Category.TYPE_ID + Category.MEDICINE.key),
    Internet(null, Category.TYPE_ID + Category.SOFTWARE.key),
    Iraqi_city(null, Category.TYPE_ID + Category.NAME.key),
    Japan(null, Category.TYPE_ID + Category.NAME.key),
    Japanese_era(null, Category.TYPE_ID + Category.TIME.key),
    Logic(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    Norse_deity(null, null),
    Pakistan(null, Category.TYPE_ID + Category.NAME.key),
    U_S(null, null),
    a_person_s(null, null),
    a_place(null, Category.TYPE_ID + Category.NAME.key),
    a_problem(null, null),
    affairs(null, null),
    ancient_measure(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    ape(null, Category.TYPE_ID + Category.ANIMALS.key),
    army(null, Category.TYPE_ID + Category.MILITARY.key),
    around(null, null),
    basketball(null, Category.TYPE_ID + Category.SPORTS.key),
    car(null, Category.TYPE_ID + Category.AUTOMOBILE.key),
    chemistry(null, Category.TYPE_ID + Category.CHEMISTRY.key),
    city_in_Brazil(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Canada(null, Category.TYPE_ID + Category.NAME.key),
    city_in_China(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Croatia(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Iraq(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Japan(null, Category.TYPE_ID + Category.NAME.key),
    city_in_Malaysia(null, Category.TYPE_ID + Category.NAME.key),
    city_in_South_Africa(null, Category.TYPE_ID + Category.NAME.key),
    city_in_the_Netherlands(null, Category.TYPE_ID + Category.NAME.key),
    coll(null, Usage.TYPE_ID + Usage.COLLOQUIAL.key),
    company_name(null, Category.TYPE_ID + Category.NAME.key),
    copy(null, null),
    county_in_Jilin(null, Category.TYPE_ID + Category.NAME.key),
    county_in_Zhejiang(null, Category.TYPE_ID + Category.NAME.key),
    criminal(null, null),
    dance(null, Category.TYPE_ID + Category.SPORTS.key),
    district_in_Shanxi(null, Category.TYPE_ID + Category.NAME.key),
    electrical(null, Category.TYPE_ID + Category.PHYSICS.key),
    farm(null, null),
    feminine_name(null, Category.TYPE_ID + Category.PEOPLE.key),
    fencing(null, null),
    finance(null, Category.TYPE_ID + Category.ECONOMY.key),
    flower(null, Category.TYPE_ID + Category.PLANTS.key),
    formal(null, null),
    from_above(null, null),
    from_illness(null, null),
    from_prison(null, null),
    future(null, null),
    give(null, null),
    grain(null, null),
    grammatical(null, Category.TYPE_ID + Category.LITERATURE.key),
    h(null, null),
    hand(null, null),
    in_the(null, null),
    in_writing(null, null),
    it_s(null, null),
    just(null, null),
    ling(null, null),
    linguistics(null, Category.TYPE_ID + Category.LITERATURE.key),
    logic(null, null),
    LONG(null, null),
    meat(null, Category.TYPE_ID + Category.CUISINE.key),
    metal(null, Category.TYPE_ID + Category.CHEMISTRY.key),
    millet(null, null),
    monkey(null, Category.TYPE_ID + Category.ANIMALS.key),
    mountain(null, Category.TYPE_ID + Category.NAME.key),
    musical_instrument(null, Category.TYPE_ID + Category.MUSIC.key),
    of_fish(null, Category.TYPE_ID + Category.CUISINE.key),
    of_fruit(null, Category.TYPE_ID + Category.CUISINE.key),
    of_mountain(null, Category.TYPE_ID + Category.GEOGRAPHY.key),
    of_two_parts(null, null),
    oneself(null, null),
    optics(null, null),
    painting(null, null),
    people(null, Category.TYPE_ID + Category.PEOPLE.key),
    philosophy(null, Category.TYPE_ID + Category.PHILOSOPHY.key),
    plant(null, Category.TYPE_ID + Category.PLANTS.key),
    position(null, null),
    programming_language(null, Category.TYPE_ID + Category.SOFTWARE.key),
    pron(null, WordType.TYPE_ID + WordType.PRONOUN.key),
    proverb(null, Usage.TYPE_ID + Usage.FIGURATIVE.key),
    radical(null, null),
    radio(null, Category.TYPE_ID + Category.MEDIA.key),
    region_in_Russia(null, Category.TYPE_ID + Category.NAME.key),
    someone_to_do_something(null, null),
    someone_s(null, null),
    state_in_Malaysia(null, Category.TYPE_ID + Category.NAME.key),
    state_of(null, null),
    summer(null, null),
    territory(null, Category.TYPE_ID + Category.NAME.key),
    unit(null, Category.TYPE_ID + Category.MATHEMATICS.key),
    with(null, null),
    Chinese(null, null),
    US(null, null),
    a_goal(null, null),
    bus(null, Category.TYPE_ID + Category.AUTOMOBILE.key),
    company(null, Category.TYPE_ID + Category.ECONOMY.key),
    country(null, Category.TYPE_ID + Category.NAME.key),
    criticism(null, null),
    film(null, Category.TYPE_ID + Category.MEDIA.key),
    geography(null, Category.TYPE_ID + Category.GEOGRAPHY.key),
    goods(null, null),
    government(null, Category.TYPE_ID + Category.POLITICS.key),
    happen(null, null),
    medical(null, Category.TYPE_ID + Category.MEDICINE.key),
    medicine(null, Category.TYPE_ID + Category.MEDICINE.key),
    moon(null, null),
    movie(null, Category.TYPE_ID + Category.MEDIA.key),
    novel(null, Category.TYPE_ID + Category.LITERATURE.key),
    of_information(null, null),
    organization(null, Category.TYPE_ID + Category.POLITICS.key),
    province(null, Category.TYPE_ID + Category.NAME.key),
    technology(null, Category.TYPE_ID + Category.TECHNOLOGY.key),
    train(null, Category.TYPE_ID + Category.RAILWAYS.key),
    what(null, null), ;
    private final String attrs;
    private final String value;

    CategoryImpl(final String value, final String attrs) {
      this.value = value;
      this.attrs = attrs;
    }

    @Override
    public String getAttributes() {
      return this.attrs;
    }

    @Override
    public String getReplacement() {
      return this.value;
    }

    @Override
    public String getConstantName() {
      return Helper.toConstantName(this.name());
    }
  }
}
