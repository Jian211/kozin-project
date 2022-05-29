<template>
<div>
    <div>
        <select v-model="selectedCity">
            <option :key="i" :value="city.code" v-for="(city,i) in cityList">{{city.name}}</option>
        </select>
        <input type="text" v-model="userName" @keyup.enter="searchUserList"/>
        <button type="button" @click="searchUserList">조회</button>
    </div>
    <div>
        <table>
            <thead>
                <tr>
                    <th>이름</th>
                    <th>나이</th>
                    <th>직업</th>
                </tr>
            </thead>
            <tbody>
                <tr :key="i" v-for="(person,i) in userList" >
                    <td>{{person.name}}</td>
                    <td>{{person.age}}</td>
                    <td>{{person.job}}</td>
                </tr>
            </tbody>
        </table>
    </div>

</div>
</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            cityList:[
                {name:'서울', code: '02'},
                {name:'부산', code: '21'},
                {name:'제주', code: '064'},
            ],
            selectedCity:'',
            userList:[],
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{
        searchUserList(){
            // const selectedCity = this.selectedCity;
            // const userName = this.userName;
            const params = {
                selectedCity : this.selectedCity,
                userName : this.userName
            }

            this.userList = this.getUserList(params);
        },
        getUserList(params){
            console.log(params)

            let list = [
                {name : '유재석', age:'49', job:'연예인'},
                {name : '하하', age:'23', job:'연예인'},
                {name : '정준하', age:'48', job:'연예인'},
                {name : '양세찬', age:'25', job:'연예인'},
            ];

            return list;
        }
    }
}
</script>

<style scoped>
</style>