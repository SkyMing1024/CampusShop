<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品发布表单</title>
		<!-- <script src="js/hm.js"></script>
        <script src="js/add.js"></script>
        <script src="js/release.js"></script>
        <script src="js/c.js"></script>
        <script src="js/common.js"></script>
        
        <script src="js/zh_cn.js"></script>
        <script src="js/qiniu.min.js"></script>
        <script src="js/plupload.full.min.js"></script> -->

		<script src="js/releasepro_js/hm.js"></script>
        <script src="js/releasepro_js/add.js"></script>
        <script src="js/releasepro_js/release.js"></script>
        <script src="js/releasepro_js/c.js"></script>
        <script src="js/releasepro_js/common.js"></script>
        
        <script src="js/releasepro_js/zh_cn.js"></script>
        <script src="js/releasepro_js/qiniu.min.js"></script>
        <script src="js/releasepro_js/plupload.full.min.js"></script>

        <script  src="js/jquery-3.1.1.min.js"></script>

        <link media="all" href="css/release_product.css" type="text/css" rel="stylesheet">
		<link media="all" href="css/index.css" type="text/css" rel="stylesheet"></head>
	
</head>
</head>
<body>
	<%@ include file="common/shop_header.jsp" %>
	<div class="container">
            <div class="main center">
                <img class="release-icon-main" src="imgs/release-icon.png" alt="">
                <div class="wave-fluid"></div>
                <div class="release-title">发布商品出售</div>
                <!-- 上传图片开始 -->
                <div class="upload-wr">
                    <div class="clone-target">
                        <div class="photo">
                            <div>
                                <img src="imgs/release" alt="" class="image">
                             </div>
                            <span class="close"></span>
                        </div>
                    </div>
                    <div class="photo-area init-up">
                        <div class="upload-area" id="upload-area" style="position: relative;">
                            <div id="upload" style="z-index: 50;">
                                <span class="up-bg"></span>
                                <span class="up-img-bg">
                                    <i>
                                    </i>
                                </span>
                            </div>
                            <div id="html5_1bf7kjaid1u048gce9t1r9sk3m3_container" 
                            	class="moxie-shim moxie-shim-html5" style="position: absolute; top: 2px; left: 0px; 
                            	width: 160px; height: 160px; overflow: hidden; z-index: 49;">
                                <input id="html5_1bf7kjaid1u048gce9t1r9sk3m3" style="font-size: 999px; opacity: 0; 
                                position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;" accept="image/*" 
                                capture="camera" type="file">
                                </div>
                        </div>
                        <div class="photo-caution">
                            <span>最多上传四张图片，支持jpg、png、gif格式</span></div>
                    </div>
                </div>
                <!-- 上传图片结束 -->
                <div class="form-wr">
                    <div class="form-must-wr">
                        <div class="form-item l goods-title">
                            <div class="form-key">
                                <span>商品名称</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="title" name="title" placeholder="最多25个字" value="" type="text"></div>
                            </div>
                        </div>
                        <div class="form-item xl goods-desc">
                            <div class="form-key">
                                <span>商品详情</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <textarea name="desc" id="desc" placeholder="建议填写物品用途、新旧程度、原价等信息，至少15个字"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-item l goods-title">
                            <div class="form-key">
                                <span>交易地点</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="trade_place" name="trade_place" placeholder="宿舍、教学楼、食堂等" value="" type="text"></div>
                            </div>
                        </div>
                        <div class="form-item m goods-price">
                            <div class="form-key">
                                <span>价格</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input class="price" id="price" name="price" value="" type="text"></div>
                            </div>
                        </div>
                        
                           <div class="form-item m">
                            <div class="form-key">
                                <span>分类</span>
                            </div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="cat" name="cat" value="" type="text">
                                    </div>
                            </div>
                        </div>

                        <!--选择分类信息 -->
                       <!--  <div class="form-item m goods-cat">
                            <div class="form-key">
                                <span>分类</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <span>请选择</span>
                                    <input id="cat" name="cat" value="" type="hidden"></div>
                                <ul class="select">
                                    <li pk="item1" value="1">
                                        <span>校园代步</span></li>
                                    <li pk="item4" value="4">
                                        <span>手机</span></li>
                                    <li pk="item5" value="5">
                                        <span>电脑</span></li>
                                    <li pk="item8" value="8">
                                        <span>数码配件</span></li>
                                    <li pk="item15" value="15">
                                        <span>数码</span></li>
                                    <li pk="item23" value="23">
                                        <span>电器</span></li>
                                    <li pk="item30" value="30">
                                        <span>运动健身</span></li>
                                    <li pk="item39" value="39">
                                        <span>衣物伞帽</span></li>
                                    <li pk="item45" value="45">
                                        <span>图书教材</span></li>
                                    <li pk="item59" value="59">
                                        <span>租赁</span></li>
                                    <li pk="item71" value="71">
                                        <span>生活娱乐</span></li>
                                    <li pk="item999" value="999">
                                        <span>其他</span></li>
                                </ul>
                            </div>
                            <div class="form-value-l hide">
                                <div class="form-input-l-wr">
                                    <span>请选择</span>
                                    <input id="cat_l" name="cat_l" value="" type="hidden"></div>
                                <ul class="select hide">
                                    <li class="item1 hide" value="2">
                                        <span>自行车</span></li>
                                    <li class="item1 hide" value="3">
                                        <span>电动车</span></li>
                                    <li class="item5 hide" value="6">
                                        <span>笔记本</span></li>
                                    <li class="item5 hide" value="7">
                                        <span>台式机</span></li>
                                    <li class="item8 hide" value="16">
                                        <span>耳机</span></li>
                                    <li class="item8 hide" value="17">
                                        <span>移动硬盘</span></li>
                                    <li class="item8 hide" value="18">
                                        <span>键盘</span></li>
                                    <li class="item8 hide" value="19">
                                        <span>鼠标</span></li>
                                    <li class="item8 hide" value="20">
                                        <span>充电器</span></li>
                                    <li class="item8 hide" value="21">
                                        <span>显示器</span></li>
                                    <li class="item8 hide" value="22">
                                        <span>其他</span></li>
                                    <li class="item8 hide" value="1062">
                                        <span>移动电源</span></li>
                                    <li class="item15 hide" value="9">
                                        <span>mp3/mp4</span></li>
                                    <li class="item15 hide" value="10">
                                        <span>相机</span></li>
                                    <li class="item15 hide" value="11">
                                        <span>单反</span></li>
                                    <li class="item15 hide" value="12">
                                        <span>游戏机</span></li>
                                    <li class="item15 hide" value="13">
                                        <span>平板</span></li>
                                    <li class="item15 hide" value="14">
                                        <span>其他</span></li>
                                    <li class="item23 hide" value="31">
                                        <span>电扇</span></li>
                                    <li class="item23 hide" value="32">
                                        <span>台灯</span></li>
                                    <li class="item23 hide" value="33">
                                        <span>洗衣机</span></li>
                                    <li class="item23 hide" value="34">
                                        <span>电吹风</span></li>
                                    <li class="item23 hide" value="35">
                                        <span>电水壶</span></li>
                                    <li class="item23 hide" value="36">
                                        <span>空调</span></li>
                                    <li class="item23 hide" value="37">
                                        <span>电视</span></li>
                                    <li class="item23 hide" value="38">
                                        <span>其他</span></li>
                                    <li class="item30 hide" value="24">
                                        <span>篮球</span></li>
                                    <li class="item30 hide" value="25">
                                        <span>足球</span></li>
                                    <li class="item30 hide" value="26">
                                        <span>球拍</span></li>
                                    <li class="item30 hide" value="27">
                                        <span>哑铃</span></li>
                                    <li class="item30 hide" value="28">
                                        <span>轮滑</span></li>
                                    <li class="item30 hide" value="29">
                                        <span>其他</span></li>
                                    <li class="item39 hide" value="46">
                                        <span>上衣</span></li>
                                    <li class="item39 hide" value="47">
                                        <span>裤子</span></li>
                                    <li class="item39 hide" value="48">
                                        <span>背包</span></li>
                                    <li class="item39 hide" value="49">
                                        <span>雨伞</span></li>
                                    <li class="item39 hide" value="50">
                                        <span>鞋</span></li>
                                    <li class="item39 hide" value="51">
                                        <span>帽子</span></li>
                                    <li class="item39 hide" value="52">
                                        <span>其他</span></li>
                                    <li class="item45 hide" value="40">
                                        <span>教材</span></li>
                                    <li class="item45 hide" value="41">
                                        <span>考研</span></li>
                                    <li class="item45 hide" value="42">
                                        <span>托福/雅思/GRE</span></li>
                                    <li class="item45 hide" value="43">
                                        <span>课外书</span></li>
                                    <li class="item45 hide" value="44">
                                        <span>其他</span></li>
                                    <li class="item59 hide" value="60">
                                        <span>租房</span></li>
                                    <li class="item59 hide" value="61">
                                        <span>服装</span></li>
                                    <li class="item59 hide" value="62">
                                        <span>道具</span></li>
                                    <li class="item59 hide" value="63">
                                        <span>其他</span></li>
                                    <li class="item71 hide" value="72">
                                        <span>乐器</span></li>
                                    <li class="item71 hide" value="73">
                                        <span>日常用品</span></li>
                                    <li class="item71 hide" value="74">
                                        <span>虚拟账号</span></li>
                                    <li class="item71 hide" value="75">
                                        <span>会员卡</span></li>
                                    <li class="item71 hide" value="76">
                                        <span>其他</span></li>
                                    <li class="item71 hide" value="1060">
                                        <span>化妆品</span></li>
                                </ul>
                            </div>
                        </div> -->
                        
                        
                        
                        <div class="form-item m goods-discount">
                            <div class="form-key">
                                <span>讲价</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <span class="yes sel" data-value="1">可小刀</span>
                                    <span class="no" data-value="0">不可刀</span>
                                    <input id="discount" name="discount" value="1" type="hidden"></div>
                            </div>
                        </div>
                    </div>
                    <div class="form-contact">联系方式</div>
                    <div class="form-least">（至少选填一项）</div>
                    <hr class="form-sep-form clear" size="1" color="#D0E0E2">
                    <div class="form-select">
                        <div class="form-item m">
                            <div class="form-key">
                                <span>手机</span>
                            </div>
                            <div class="form-value">
                                <div class="form-input-wr" style="background-color: rgb(246, 249, 249); border: 1px solid rgb(208, 224, 226);">
                                    <input id="tel" name="tel" value="" type="tel">
                                </div>
                            </div>
                        </div>
                        <div class="form-item m">
                            <div class="form-key">
                                <span>QQ</span>
                            </div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="qq" name="qq" value="" type="text">
                                    </div>
                            </div>
                        </div>
                    </div>

                    <!-- <div class="form-share-wr">
                        <label for="form-share">
                            <input id="form-share" name="share" checked="checked" type="checkbox">
                            <span>我同意&nbsp;
                                <a href="http://www.2shoujie.com/publish_rule" target="_top">商品发布规则</a></span>
                        </label>
                    </div> -->
                    <input id="school_id" value="1" type="hidden">
                    <input id="user_school_id" value="1" type="hidden">
                    <button type="button" class="form-submit" onclick="pre_release();">马上发布</button>
                  </div>
            </div>
        </div>

</body>
</html>