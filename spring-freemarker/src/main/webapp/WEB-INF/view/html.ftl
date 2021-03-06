<!doctype html>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Foundation | Welcome</title>
    <link rel="stylesheet" href="/static/lib/foundation/css/foundation.min.css">
    <link href="/static/lib/foundation/css/foundation-icons.css" rel='stylesheet' type='text/css'>

</head>
<body>

<div class="top-bar">
    <div class="top-bar-left">
        <ul class="menu">
            <li class="menu-text">Yeti Agency</li>
        </ul>
    </div>
    <div class="top-bar-right">
        <ul class="menu">
            <li><a href="#">One</a></li>
            <li><a href="#">Two</a></li>
            <li><a href="#">Three</a></li>
            <li><a href="#">Four</a></li>
        </ul>
    </div>
</div>

<div class="callout large primary">
    <div class="row column text-center">
        <h1>Our Blog</h1>
    </div>
</div>
<div class="row" id="content">

    <div class="medium-8 columns">
    <#list books as book>
        <div class="blog-post">
            <h3>${book}
                <small>3/6/2016</small>
            </h3>
            <img class="thumbnail" src="/static/img/text.png">
            <p>Praesent id metus massa, ut blandit odio. Proin quis tortor orci. Etiam at risus et justo dignissim
                congue. Donec congue lacinia dui, a porttitor lectus condimentum laoreet. Nunc eu ullamcorper orci.
                Quisque eget odio ac lectus vestibulum faucibus eget in metus. In pellentesque faucibus vestibulum.
                Nulla at nulla justo, eget luctus.</p>
            <div class="callout">
                <ul class="menu simple">
                    <li><a href="#">Author: Mike Mikers</a></li>
                    <li><a href="#">Comments: 3</a></li>
                </ul>
            </div>
        </div>
    <#else>
        Part executed when there are 0 items
    </#list>
    </div>


    <div class="medium-3 columns" data-sticky-container>
        <div class="sticky" data-sticky data-anchor="content">
            <h4>Categories</h4>
            <ul>
                <li><a href="#">Skyler</a></li>
                <li><a href="#">Jesse</a></li>
                <li><a href="#">Mike</a></li>
                <li><a href="#">Holly</a></li>
            </ul>
            <h4>Authors</h4>
            <ul>
                <li><a href="#">Skyler</a></li>
                <li><a href="#">Jesse</a></li>
                <li><a href="#">Mike</a></li>
                <li><a href="#">Holly</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="row column">
    <ul class="pagination" role="navigation" aria-label="Pagination">
        <li class="disabled">Previous</li>
        <li class="current"><span class="show-for-sr">You're on page</span> 1</li>
        <li><a href="#" aria-label="Page 2">2</a></li>
        <li><a href="#" aria-label="Page 3">3</a></li>
        <li><a href="#" aria-label="Page 4">4</a></li>
        <li class="ellipsis"></li>
        <li><a href="#" aria-label="Page 12">12</a></li>
        <li><a href="#" aria-label="Page 13">13</a></li>
        <li><a href="#" aria-label="Next page">Next</a></li>
    </ul>
</div>
<script src="/static/lib/foundation/js/vendor/jquery.js"></script>
<script src="/static/lib/foundation/js/vendor/what-input.js"></script>
<script src="/static/lib/foundation/js/vendor/foundation.js"></script>
<script src="/static/lib/foundation/js/app.js"></script>
</body>
</html>
<script src="/static/lib/jquery/jquery-2.1.4.min.js"></script>
<script>
    $(document).foundation();
</script>
<script type="text/javascript" src="/static/lib/foundation/js/vendor/zcom.js"></script>
</body>
</html>
