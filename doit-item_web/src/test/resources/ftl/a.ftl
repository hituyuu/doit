
<!DOCTYPE html>
<html>
<head>
    <title>百世快递 - 站点查询 </title>
    <meta name="keywords" content="百世,快递, 百世快递,速递">
    <meta name="description" content="百世快递是百世集团旗下专业快递品牌，以“精彩生活，快递欢乐”为理念，为用户提供“年轻、快乐”的快递服务">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <link rel="shortcut icon" type="image/x-icon" href="/images/800bestexicon.ico" />
    <link href="css/d5925316d37e49a69a613e366b3e9566.css" rel="stylesheet"/>

    <link href="css/ef330b31a46e41c9a7a95b947859cece.css" rel="stylesheet"/>

    <link href="css/52d8f432e70449fb8ae85b26d93307a0.css" rel="stylesheet"/>

    <link href="css/2d18ed5dc1c1420998e61e787f4525a8.css" rel="stylesheet"/>

    <script src="js/f2e82356f63e4cb7b78d0b4d9f741b8e.js"></script>

    <script>
        var urlConfig = {
            web: "",
            api: "/htwebapi",
            q9api : "/q9api",
            wx: "/wxapi",
            wxplatform: "http://psapi.appl.800best.com/",
            weixinappid: "wx61af89c230ee8c23",
            wxVerificationCodePath: "/security/sendsms"
        };
        var appConfig = {
            appId: "HTWeb",
            userId: "",
            userName: ""
        }
        var app = {}
        $(function () {
            $(':text, textarea').placeholder();
        });
    </script>

</head>
<body>

    <div class="topnav">
    <div class="container clearfix">
        <img onclick="window.open('http://webcs.800best.com/smWeb.html', 'webcs', 'width=750,height=600,toolbar=no, menubar=no, scrollbars=no, resizable=yes,location=no, status=no,center=yes');" src="picture/minionlinesevice.png" style="position:absolute;right:0;top:0;cursor:pointer" />
        <span class="pull-left">
            <a href="http://www.800best.com" target="_blank">百世集团官网</a> |
            <a href="javascript:void(0);" class="addFavorite">加入收藏</a> |
            <a href="javascript:void(0);" class="follow-wx">关注微信</a> |
            <a href="javascript:void(0);" class="follow-wxxcx">使用微信小程序</a> |
            <a href="javascript:void(0);" class="follow-alipay">关注支付宝服务窗</a> |
            

        </span>
        
        

    </div>
</div>
<div class="modal hide fade wx-box p20" id="wx-box" style="text-align: center; width: 360px; margin-left: -180px;">
    <img src="picture/wx.jpg"/>
    <div class="text-center" style="background: #ff3d3b">
        <p class="font14 font-white">用微信扫一扫</p>
        <p class="font12 font-white">关注百世快递官方微信</p>
    </div>
</div>
<div class="modal hide fade wxxcx-box p20" id="wxxcx-box" style="text-align: center; width: 360px; margin-left: -210px;">
    <img src="picture/wxxcx.jpg"/>
    <!--<div class="text-center" style="background: #ff3d3b">
        <p class="font14 font-white">用微信扫一扫</p>
        <p class="font12 font-white">关注百世快递官方微信</p>
    </div>-->
</div>
<div class="modal hide fade alipay-box p20" id="alipay-box" style="text-align: center;width:360px;margin-left:-240px;">
    <img src="picture/alipay_qr.jpg" />
    <div class="text-center" style="background:#ff3d3b">
        <p class="font14 font-white">用支付宝扫一扫</p>
        <p class="font12 font-white">关注百世快递服务窗</p>
    </div>
</div>
<script>

    $(document).ready(function () {
        $(".follow-wx").popover({
            html: true,
            trigger: 'hover',
            content: $('#wx-box').html(),
            placement: 'bottom'
        });
        $(".follow-alipay").popover({
            html: true,
            trigger: 'hover',
            content: $('#alipay-box').html(),
            placement: 'bottom'
        })
        $(".follow-wxxcx").popover({
            html: true,
            trigger: 'hover',
            content: $('#wxxcx-box').html(),
            placement: 'bottom'
        })
        // $(".follow-wx").bind("click", function () {
        //     var detail = $('#wx-box')

        //     detail.modal('show')
        // })

    })

</script>
    <div class="nav main-nav" id="main-nav">
    <div class="container">
        <div class="border-line hide"></div>
        <div class="logo pull-left">
            <a href="/" title="百世快递">
                <img src="picture/logo.png"  alt="百世快递">
            </a>
        </div>
        <ul id="main-nav-wrap" class="unstyled inline clearfix pull-right">
            <li><a href="/">首 页</a></li>
            <li><a href="/Bill/Track">查 件</a></li>
            <li><a href="/Order/Create">寄 件</a></li>
            <li><a href="javascript:void(0);">网 点</a>
                <ul class="unstyled hide" style="position: absolute;left : -20px;width : 85px;">
                    <li><a href="/Site/Query">百世快递站点</a> </li>
                    <li><a href="/Site/ServiceQuery">百世快递服务点</a> </li>
                </ul>
            </li>

            <li>
                <a href="javascript:void(0);">产品服务</a>
               
                <ul class="unstyled hide">
                    <li><a href="/Best/Products">快递</a></li>
                    <li><a href="http://www.800best.com/freight/" target="_blank">快运</a></li>
                    <li><a href="http://www.800best.com/supply-chain/" target="_blank">云仓</a></li>
                </ul>
            </li>
            <li><a href="/News/List">新闻中心</a></li> 
            <li><a href="javascript:void(0);">企业服务</a>
                <ul class="unstyled hide">
                    <li><a href="http://www.800best.com/express/partner/" target="_blank">加盟合作</a></li>
                    <li><a href="/static/Index/70EBB44ADC5E52ED" target="_blank">采购招标</a> </li>
                </ul>
            </li>
            <li><a href="/Help" style="padding-right:0;">帮助中心</a></li>
        </ul>
        
    </div>
</div>
    

    <div class="flexslider slide   siteslide" id="slide">
        

    </div>

    <div class="main">
        <div class="container">

            
<h2 class="title"><i class="icon icon-s1 icon-site"></i> 站点</h2>=======${name}
<div class="box site-box">
	<div class="search">
		<form class="form-inline" id="site-form">
		
			<label for="district" class="pull-left">地区</label> 
			<div class="district-input-wrap pull-left">
				<input type="text" class="district-input input-large" id="district" placeholder="输入城市名（中文/拼音首字母）" value="">
				<i class="icon icon-district"></i>
			</div>
			

			<input type="hidden" id="province" name="province">
			<input type="hidden" id="city" name="city">
			<input type="hidden" id="county" name="county">
		  	
			<label for="query" class="pull-left ml10">关键字</label> 
		  	<input type="text" class="input-large pull-left" name="query" id="query" placeholder="路名、小区、站点名等">

		 	<button type="button" class="btn blue high pull-left ml10 disabled" id="site-btn" disabled="true">
		 		<!-- <i class="icon icon-s1 icon-query"></i> -->
		 		查 询
		 	</button>
		 	
		 	<button type="button" id="map-btn" class="btn btn-link"><i class="icon icon-s1 icon-map"></i>网点地图</button>
		</form>
		<div class="hot" id="hot">
			<a href="#" data-fullname="上海-上海市">上海</a>  
			<a href="#" data-fullname="北京-北京市">北京</a>  
			<a href="#" data-fullname="浙江省-杭州市">杭州</a>  
			<a href="#" data-fullname="江苏省-苏州市">苏州</a>  
			<a href="#" data-fullname="广东省-广州市">广州</a>  
			<a href="#" data-fullname="广东省-深圳市">深圳</a>  
			<a href="#" data-fullname="江苏省-南京市">南京</a>  
			<a href="#" data-fullname="浙江省-宁波市">宁波</a>  
			<a href="#" data-fullname="四川省-成都市">成都</a>  
			<a href="#" data-fullname="湖北省-武汉市">武汉</a>  
			<a href="#" data-fullname="江苏省-无锡市">无锡</a>  
			<a href="#" data-fullname="浙江省-温州市">温州</a>  
		</div>
	</div>
    
<div class="site-map pb20" id="site-map" style="text-align: center;">
    <img src="picture/map.gif" alt="" usemap="#map">
</div>
<map name="map" id="map">
    <area shape="rect" coords="582,100,625,117"  href="黑龙江省"/>
    <area shape="rect" coords="584,150,613,166"  href="吉林省" />
    <area shape="rect" coords="558,182,586,202"  href="辽宁省" />
    <area shape="rect" coords="113,190,209,209"  href="新疆维吾尔自治区"  />
    <area shape="rect" coords="384,205,456,223"  href="内蒙古自治区"  />
    <area shape="rect" coords="485,201,517,220"  href="北京-北京市"  />
    <area shape="rect" coords="517,229,544,248"  href="天津-天津市"  />
    <area shape="rect" coords="134,345,220,364"  href="西藏自治区"  />
    <area shape="rect" coords="247,281,282,299"  href="青海省"  />
    <area shape="rect" coords="366,262,401,279"  href="宁夏回族自治区"  />
    <area shape="rect" coords="440,261,472,277"  href="山西省"/>
    <area shape="rect" coords="478,246,505,260"  href="河北省"/>
    <area shape="rect" coords="505,270,533,288"  href="山东省"/>
    <area shape="rect" coords="348,304,378,319"  href="甘肃省"/>
    <area shape="rect" coords="402,311,431,331"  href="陕西省"/>
    <area shape="rect" coords="456,311,491,329"  href="河南省"/>
    <area shape="rect" coords="546,336,575,354"  href="江苏省"/>
    <area shape="rect" coords="591,366,645,386"  href="上海省"/>
    <area shape="rect" coords="323,365,350,383"  href="四川省"/>
    <area shape="rect" coords="400,355,431,375"  href="重庆省"/>
    <area shape="rect" coords="449,357,475,373"  href="湖北省"/>
    <area shape="rect" coords="515,352,545,370"  href="安徽省"/>
    <area shape="rect" coords="549,376,576,395"  href="浙江省"/>
    <area shape="rect" coords="307,454,340,477"  href="云南省"/>
    <area shape="rect" coords="381,426,407,445"  href="贵州省"/>
    <area shape="rect" coords="442,406,474,425"  href="湖南省"/>
    <area shape="rect" coords="493,399,524,417"  href="江西省"/>
    <area shape="rect" coords="528,425,553,442"  href="福建省"/>
    <area shape="rect" coords="570,456,604,473"  href="台湾省"/>
    <area shape="rect" coords="410,465,440,483"  href="广西省"/>
    <area shape="rect" coords="474,462,508,482"  href="广东省"/>
    <area shape="rect" coords="508,491,539,508"  href="香港特别行政区"/>
    <area shape="rect" coords="474,506,507,523"  href="澳门特别行政区"/>
    <area shape="rect" coords="417,537,451,556"  href="海南省"/>
</map>

    <div class="modal hide fade site-detail p20 loading" id="site-detail">
		
	</div>
	<div class="sites hide" id="sites">


	</div>

</div>

<script id="sites-template" type="text/template">

	<% if(!_.isEmpty(data)){ %>
		<% _.each(data,function(value,key){ %>
		<strong class="font-blue{{klass}}" title="{{key}}"><i class="pull-left icon icon-s1 icon-location"></i> {{key.split('-')[1]}}-{{value.length}}个站点</strong>
		<ul class="unstyled inline clearfix">
			<% _.each(value,function(item){ %>
			<li>
				<a data-type="{{type}}" data-keyboard="true" data-toggle="modal" data-target="#site-detail" href="#{{item.id}}" title="{{item.name}}">{{item.name && item.name.length > 10 ? item.name.slice(0,10) + '···' : item.name}}</a>   
			</li>
			<% }); %>
		</ul>
		<% }); %>
	<%}else{%>
			<div class="no-results text-center">

				<i class="icon icon-s3 icon-no"></i>
				<p class="">对不起呃，没有相关资料！<br>
尝试换个关键词，比如更大的范围或离你最近的较大城镇。</p>
				<p class="contact">若需要更多帮助，可以联系<a href="javascript:void(0);" onclick="window.open('http://webcs.800best.com/smWeb.html', 'webcs', 'width=750,height=600,toolbar=no, menubar=no, scrollbars=no, resizable=yes,location=no, status=no,center=yes');" class="font-blue">在线客服</a>。</p>				
			</div>
	<%}%>

</script>
<script type="text/template" id="site-detail-template">
 <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 class="font-blue">{{name}}</h3>
  </div>
  <div class="modal-body">

	<table class="table table-bordered">
		<tbody>
		<% if(_data === true){ %>
			<tr>
				<td style="width:60px">负责人</td>
				<td class="font-blue">{{owner}}</td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td class="font-blue">{{phone}}</td>
			</tr>
			<tr>
				<td>传真号码</td>
				<td class="font-blue">{{fax}}</td>
			</tr>
		
			<tr>
				<td>派送范围</td>
				<td class="font-blue">{{range}}</td>
			</tr>
			<tr>
				<td>不派送区</td>
				<td class="font-blue">{{notrange}}</td>
			</tr>
			<tr>
				<td>派送时限</td>
				<td class="font-blue"></td>
			</tr>
			<tr>
				<td>备注</td>
				<td class="font-blue">{{remark}}</td>
			</tr>
		
		<%}else{%>
			<tr>
			<td>该站点无详情数据</td>
			</tr>
		<%}%>
		</tbody>
	</table>
  </div>
</script>
        </div>
    </div>
    
    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="span span2">
                    <dl>
                        <dt class="foot-blue">企业服务</dt>
                        <dd><a class="foot-blue" href="http://www.800best.com/express/partner/" target="_blank">加盟合作</a></dd>
                        <dd><a class="foot-blue" href="/static/Index/70EBB44ADC5E52ED" target="_blank">采购招标</a></dd>
                        <dd><a class="foot-blue" href="http://inner.800bestex.com:8090/" target="_blank">站点登录入口</a></dd>
                    </dl>
                </div>
                <div class="span span2">
                    <dl>
                        <dt>查询·寄件</dt>
                        <dd><a href="/bill/track">运单追踪</a></dd>
                        <dd><a href="/order/create">寄件</a></dd>
                        <dd><a href="/Site/Query">网点</a></dd>
                        <dd><a href="/Best/Products">产品服务</a></dd>
                        <dd><a class="foot-red" href="/static/Index/28B9E6753B7C2055" target="_blank">禁寄须知</a></dd>
                    </dl>
                </div>
     
                <div class="span span2">
                    <dl>
                        <dt>关于我们</dt>
                        <dd> <a href="/news/list">新闻中心</a></dd>
                        <dd><a target="_blank" href="http://www.800best.com/hr">人才招聘</a></dd>
                        <!-- <dd><a href="#">关于百世快递</a></dd> -->
                        <dd><a href="/home/About">关于百世快递</a></dd>
                        <dd><a target="_blank" href="http://www.800best.com ">百世物流</a></dd>
                    </dl>
                </div>
                <div class="span span2">
                    <dl>
                        <dt>帮助中心</dt>
                  
                        <dd class="">95320</dd>
                        <dd><a  href="javascript:void(0);" onclick="window.open('http://webcs.800best.com/smWeb.html', 'webcs', 'width=750,height=600,toolbar=no, menubar=no, scrollbars=no, resizable=yes,location=no, status=no,center=yes');">在线客服</a></dd>
                        <dd><a href="javascript:void(0);" onclick="window.open('http://webcs.800best.com/smWeb.html', 'webcs', 'width=750,height=600,toolbar=no, menubar=no, scrollbars=no, resizable=yes,location=no, status=no,center=yes');">投诉与建议</a></dd>
                        <dd></dd>
                        <dd><a href="/static/Index/BB4318709137ED52">各地客服电话</a></dd>
                    </dl>
                </div>
                <div class="span wx-span" style="float:right">
                    <div class="divider">
                        <div>微信公众号</div>
                    </div>
                    <div class="row mt30">
                        <div class="span text-center">
                            <div>
                                <img src="picture/htewm.png" alt="访问百世快递官方微博">
                            </div>
                            <div class="mt10 pt5">百世快递</div>
                        </div>
                        <div class="span text-center" style="float: right">
                            <div>
                                <img src="picture/rcewm.png" alt="百世招聘">
                            </div>
                            <div class="mt10 pt5">百世招聘</div>                           
                        </div>
                    </div>
           
                </div>
            </div>

            <div class="copy row">
                <div class="span span1">
                    <a href="http://www.spb.gov.cn" target="_blank" title="中华人民共和国国家邮政局">
                        <img src="picture/f1.png" alt="中华人民共和国国家邮政局">
                    </a>
                    <a href="http://www.cea.org.cn" target="_blank" title="中国快递协会">
                        <img src="picture/f2.png" alt="中国快递协会">
                    </a>

                    
                </div>
                <div class="span span8">
                    百世网络 版权所有 Copyright 2014 800bestex.com Inc. All rights reserved.  <a href="http://www.miibeian.gov.cn" target="_blank" style="text-decoration: underline;">沪ICP备11045012号</a>
                  

                </div>
                <div class="span span3 text-right">
                   百世快递微博：<a href="http://e.weibo.com/bestexpress" target="_blank" title="访问百世快递官方微博"><img src="picture/f3.png" alt="访问百世快递官方微博"></a>
                </div>
            </div>
            <div class="text-center">  
                    <a style="color:#939393;" target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31011802001068">
                        <img src="picture/beian.png" />沪公网安备 31011802001068号
                    </a>
                    <a style="color:#939393;text-decoration: underline" target="_blank" href="/Images/yyzz.jpg">企业营业执照</a>
            </div>
        </div>
    </div>
</body>
</html>
<script src="js/74c1610fdf8c417f9549981b4499c15a.js"></script>

<script src="js/9ce6da082f594bd2956c557f4eaac49d.js"></script>

<script src="js/ddf1e8e972a34d2c88b89deadcc4d4ba.js"></script>


        <div class="hide">
            <script type="text/javascript">
                var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
                document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F8fd193f17ae8acf2be1a1cfc65323057' type='text/javascript'%3E%3C/script%3E"));
            </script>
            <script src="js/stat.js" language="JavaScript"></script>
        </div>

