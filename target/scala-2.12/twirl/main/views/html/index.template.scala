
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.SunInfo,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sunInfo: models.SunInfo, temperature: Double):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
           href=""""),_display_(/*7.19*/routes/*7.25*/.Application.versioned("images/favicon.png")),format.raw/*7.69*/("""">
    </head>
    <body>
        <h1>Hello Play</h1>
        <div>Sunrise time: """),_display_(/*11.29*/sunInfo/*11.36*/.sunrise),format.raw/*11.44*/("""</div>
        <div>Sunset time: """),_display_(/*12.28*/sunInfo/*12.35*/.sunset),format.raw/*12.42*/("""</div>
        <div>Current temperature: """),_display_(/*13.36*/temperature),format.raw/*13.47*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(sunInfo:models.SunInfo,temperature:Double): play.twirl.api.HtmlFormat.Appendable = apply(sunInfo,temperature)

  def f:((models.SunInfo,Double) => play.twirl.api.HtmlFormat.Appendable) = (sunInfo,temperature) => apply(sunInfo,temperature)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 07:46:57 UTC 2019
                  SOURCE: /opt/jemstep/code/scala-web-project/app/views/index.scala.html
                  HASH: 5cbac47f0c9c216c4736f2d3ebdd0133f2e30ce8
                  MATRIX: 744->1|884->48|1051->189|1065->195|1129->239|1238->321|1254->328|1283->336|1344->370|1360->377|1388->384|1457->426|1489->437
                  LINES: 21->1|26->2|31->7|31->7|31->7|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13
                  -- GENERATED --
              */
          