<#-- @ftlvariable name="entries" type="kotlin.collections.List<com.jetbrains.handson.website.BlogEntry>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Wingbuddies</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
    <#--    <link rel="stylesheet" href="/static/debug.css">-->
</head>
<body>
<section class="hero is-primary">
    <div class="hero-body">
        <div class="container">
            <p class="title">
                Wingbuddies
            </p>
            <p class="subtitle">
                See you on the water
            </p>
        </div>
    </div>
</section>
<section class="section has-background-light">
    <div class="container">
        <div class="columns">
            <div class="column">
                <#list entries as item>
                    <article class="media notification is-info">
                        <figure class="media-left">
                            <span class="icon is-medium">
                                <i class="fab fa-2x fa-css3-alt"></i>
                            </span>
                        </figure>
                        <div class="media-content">
                            <div class="content">
                                <h3 class="subtitle">${item.headline}</h3>
                                <p>${item.body}</p>
                            </div>
                        </div>
                    </article>
                </#list>
            </div>
            <div class="column is-one-third">
                <form action="/submit" method="post">
                    <p class="subtitle">
                        Neue Session...
                    </p>
                    <div class="field">
                        <div class="control">
                            <input class="input" type="text" name="headline" placeholder="Wo gehts hin?">
                        </div>
                    </div>
                    <div class="field">
                        <div class="control">
                            <textarea class="textarea" name="body" placeholder="Body"></textarea>
                        </div>
                    </div>
                    <input class="button" type="submit">
                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
