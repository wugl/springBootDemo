<!DOCTYPE html>
<html>

<link rel="stylesheet" href="css/css01.css">
<script src="js/jquery.min.js"></script>
<body>
Hello,${name}.欢迎阅读《${bookTitle}》
<br>
${randomInt}

<br>
${randomStr}


<br>
对于静态文件，Spring Boot的加载顺序是
META-INF/resources > resources > static > public
<br>

<img src="img/order.png" alt="">

<script>
    $('body').css({
        'color':'blue'
    });
</script>
</body>
</html>