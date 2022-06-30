<template>
  <div class="home">
    <h1>GO</h1>
  </div>
</template>

<script>
// @ is an alias to /src
import axios from "axios";

export default {
  data(){
    return{
      days : {
        nowYear: '',
        nowMonth: '',
        nowDate: '',
        nowDay: '',
        day :["月","火","水","木","金","土","日"]
      },
    }
  },
  mounted(){
      this.test();
  },
  methods:{
    async test(){
      await axios.get("/hello");
    }
  },
  components: {
  }
}
</script>
