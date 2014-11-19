$(function(){
    $(".facebook").hover(function(){
        $(".facebook").hide();
        $(".facebook_hide").show();
    });
    $(".facebook_hide").mouseleave(function(){

        $(".facebook").show();
        $(".facebook_hide").hide();
    });
    $(".twitter").hover(function(){
        $(".twitter").hide();
        $(".twitter_hide").show();
    });
    $(".twitter_hide").mouseleave(function(){

        $(".twitter").show();
        $(".twitter_hide").hide();
    });
    $(".googleplus").hover(function(){
        $(".googleplus").hide();
        $(".googleplus_hide").show();
    });
    $(".googleplus_hide").mouseleave(function(){

        $(".googleplus").show();
        $(".googleplus_hide").hide();
    });
    $(".youtube").hover(function(){
        $(".youtube").hide();
        $(".youtube_hide").show();
    });
    $(".youtube_hide").mouseleave(function(){

        $(".youtube").show();
        $(".youtube_hide").hide();
    });
});